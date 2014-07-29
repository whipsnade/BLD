package DAO;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import DAO.HibernateSessionFactory;
import DAO.Interface.IBaseHibernateDAO;

public class BaseHibernateDAO<T> implements IBaseHibernateDAO<T> {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	public Transaction getTransaction(){
		return getSession().beginTransaction();
	}
	
	private static final Log log = LogFactory.getLog(BaseHibernateDAO.class);

	protected void initDao() {
		
	}
	

	public boolean save(T domain) {
		log.debug("saving domain instance");
		 Session session = null;
	        try {  
	            session = getSession();    
	            session.beginTransaction(); 
	            session.save(domain);  
	            session.getTransaction().commit();  
	            return true;
	        }catch(Exception e) {  
	            e.printStackTrace();  
	            session.getTransaction().rollback();
	            return false;
	        }finally {
	            if (session != null) {  
	                if (session.isOpen()) {  
	                    //关闭session  
	                    session.close();  
	                }  
	            }
	        }
	
	}
	

	public void saveOrUpdate(T domain) {
		log.debug("saving domain instance");
		 Session session = null;
	        try {  
	            session = getSession();    
	            session.beginTransaction(); 
	            session.saveOrUpdate(domain);
	            session.getTransaction().commit();  
	        }catch(Exception e) {  
	            e.printStackTrace();  
	            session.getTransaction().rollback();
	        }finally {
	            if (session != null) {  
	                if (session.isOpen()) {  
	                    //关闭session  
	                    session.close();  
	                }  
	            }
	        }
		
	}

	public boolean delete(T domain) {
		log.debug("deleting domain instance");
		  Session session = null;
	        try {  
	            session = getSession();    
	            session.beginTransaction(); 
	            session.delete(domain);  
	            session.getTransaction().commit();  
	            return true;
	        }catch(Exception e) {  
	            e.printStackTrace();  
	            session.getTransaction().rollback();
	            return false;
	        }finally {
	            if (session != null) {  
	                if (session.isOpen()) {  
	                    //关闭session  
	                    session.close();  
	                }  
	            }
	        }
		
	}

	@SuppressWarnings("unchecked")

	public T findById(Integer id) {
		log.debug("getting domain instance with id: " + id);
		try {
			T instance = (T) getSession().get(
					 typeClass().getName(), id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}finally{
			getSession().close();
		}
	}

	@SuppressWarnings("unchecked")

	public List<T> findByExample(T domain) {
		log.debug("finding domain instance by example");
		try {
			List results = getSession().createCriteria(
					typeClass().getClass().toString()).add(
			Example.create(domain)).list();
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}finally{
			getSession().close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> findByProperty(String propertyName, Object value) {
		log.debug("finding domain instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from "+getTableName()+" as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}finally{
			getSession().close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByProperty(String[] propertyNames, Object[] values) {
		try {
			String queryString = "from "+getTableName()+" as model where";
			for(String propertyName:propertyNames){
				queryString+=" model."+propertyName+"=? and";
			}
			queryString=StringUtils.removeEnd(queryString, "and");
			Query queryObject = getSession().createQuery(queryString);
			for (int i = 0; i < values.length; i++) {
				queryObject.setParameter(i, values[i]);
			}	
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}finally{
			getSession().close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> fuzzyFindByProperty(String propertyName,Object value) {
		log.debug("finding domain instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = " from "+getTableName()+" as model where LOWER(model."
					+ propertyName + ") like ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setString(0, "%"+String.valueOf(value).toLowerCase()+"%");
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}finally{
			getSession().close();
		}
	}
	@SuppressWarnings("unchecked")
	public List<T> findByProperty(String propertyName,Object value,int firstResult,int size) {
		log.debug("finding domain instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from "+getTableName()+" as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(firstResult);
			queryObject.setMaxResults(size);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}finally{
			getSession().close();
		}
	}
	

	
	@SuppressWarnings("unchecked")
	public List<T> findAll(String orderby, boolean isAsc) {
		log.debug("finding all doamin instances");
		try {
			String queryString = "from "+getTableName();
			if(isAsc){
				queryString+=" order by "+orderby+ " ASC";
			}else{
				queryString+=" order by "+orderby+ " DESC";
			
			}
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}finally{
			getSession().close();
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(int firstResult,int size,String orderby, boolean isAsc) {
		log.debug("finding all doamin instances");
		try {
			String queryString = "from "+getTableName();
			if(isAsc){
				queryString+=" order by "+orderby+ " ASC";
			}else{
				queryString+=" order by "+orderby+ " DESC";
			
			}
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(firstResult);
			queryObject.setMaxResults(size);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}finally{
			getSession().close();
		}
	}
	


	public boolean  update(T instance) {
		log.debug("attaching dirty Users instance");
       
        Session session = null;
        try {  
            session = getSession();    
            session.beginTransaction(); 
            session.update(instance);   
            session.getTransaction().commit();  
            return true;
        }catch(Exception e) {  
            e.printStackTrace();  
            session.getTransaction().rollback();
            return false;
        }finally {
            if (session != null) {  
                if (session.isOpen()) {  
                    //关闭session  
                    session.close();  
                }  
            }
        }
	}
	
	
	
	//取得泛型类型
	@SuppressWarnings("unchecked")
	protected Class<T> typeClass() {
		return (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	//取得泛型tableName
	private String getTableName() {
		return typeClass().getSimpleName();
	}
}

