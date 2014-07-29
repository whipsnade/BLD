package DAO;

import java.util.List;

import DAO.Interface.IClassidDao;
import DataBase.Classid;
import DataBase.User;

public class ClassidDaoImpl extends BaseHibernateDAO<Classid> implements IClassidDao {

	public Classid getClassidByID(String ID) {
		// TODO Auto-generated method stub
		return (Classid) super.findByProperty("ID",ID);
	}

	public Classid getClassidByName(String Name) {
		// TODO Auto-generated method stub
		return (Classid) super.findByProperty("name",Name);
	}

	public Classid getClassidByPhone(String Phone) {
		// TODO Auto-generated method stub
		return (Classid) super.findByProperty("phone",Phone);
	}

	public boolean saveClassid(Classid temp) {
		// TODO Auto-generated method stub
		return super.save(temp);
	}

	public boolean updateClassid(Classid domain) {
		// TODO Auto-generated method stub
		return super.update(domain);
	}

	public boolean delete(Classid domain) {
		// TODO Auto-generated method stub
		return super.delete(domain);
	}

	public List<Classid> findAll(String orderby, boolean isAsc) {
		// TODO Auto-generated method stub
		return super.findAll(orderby,isAsc);
	}

	public List<Classid> findAll(int firstResult, int size,String orderby, boolean isAsc) {
		// TODO Auto-generated method stub
		return super.findAll(firstResult, size,orderby,isAsc);
	}

	public List<Classid> findByExample(Classid domain) {
		// TODO Auto-generated method stub
		return super.findByExample(domain);
	}

	
	public List<Classid> findByProperty(String[] propertyNames, Object[] values) {
		// TODO Auto-generated method stub
		return super.findByProperty(propertyNames, values);
	}

}
