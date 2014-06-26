package DAO;

import DAO.Interface.*;

import DataBase.*;

public class DaoFactory {
	private static DaoFactory m_Instance = null;
	IUserDao user_dao;
	IStoreDao store_dao;
	IOrderDao order_dao;
	IProductDao product_dao;
	IClassidDao class_dao;
	IAddressDao address_dao;
	
	
    private DaoFactory() {
    	
    }
    
    public static DaoFactory getInstance() {
        if (m_Instance == null) {
        	m_Instance = new DaoFactory();
        }
        
        return m_Instance;
    }
    
    public IUserDao getUserDao(){
    	if(user_dao==null){
    		user_dao= new UserDaoImpl();
    	}
    		return user_dao;
    }
    
    public IStoreDao  getStoreDao(){
    	if(store_dao==null){
    		store_dao= new StoreDaoImpl();
    	}
    		return store_dao;
    	
    }
    public IOrderDao  getOrderDao(){
    	if(order_dao==null){
    		order_dao= new OrderDaoImpl();
    	}
    		return order_dao;
    }
    public IProductDao  getProductDao(){
    	if(product_dao==null){
    		product_dao= new ProductDaoImpl();
    	}
    		return product_dao;
    }
    public IAddressDao  getAddressDao(){
    	if(address_dao==null){
    		address_dao = new AddressDaoImpl();
    	}
    		return address_dao;
    }
    
    public IClassidDao  getClassidDao(){
    	if(class_dao==null){
    		class_dao = new ClassidDaoImpl();
    	}
    		return class_dao;
    }
    
    public IBaseHibernateDAO<Complaint>  getComplaintDao(){
    	return new BaseHibernateDAO<Complaint>();
    }
    public IBaseHibernateDAO<ComplaintId>  getComplaintIdDao(){
    	return new BaseHibernateDAO<ComplaintId>();
    }
    public IBaseHibernateDAO<Favorite>  getFavoriteDao(){
    	return new BaseHibernateDAO<Favorite>();
    }
    
    public IBaseHibernateDAO<Lnkordertoproduct>  getLnkordertoproductDao(){
    	return new BaseHibernateDAO<Lnkordertoproduct>();
    }
    
    public IBaseHibernateDAO<Lnkstoretoarea>  getLnkstoretoareaDao(){
    	return new BaseHibernateDAO<Lnkstoretoarea>();
    }
    
    public IBaseHibernateDAO<Lnkstoretoproduct>  getLnkstoretoproductDao(){
    	return new BaseHibernateDAO<Lnkstoretoproduct>();
    }
    
    public IBaseHibernateDAO<ProductClass>  getProductClassDao(){
    	return new BaseHibernateDAO<ProductClass>();
    }
    
    public IBaseHibernateDAO<Returnorder>  getReturnorderDao(){
    	return new BaseHibernateDAO<Returnorder>();
    }
    
    public IBaseHibernateDAO<Waiter>  getWaiterDao(){
    	return new BaseHibernateDAO<Waiter>();
    }
    
    public IBaseHibernateDAO<Master>  getMasterDao(){
    	return new BaseHibernateDAO<Master>();
    }
}
