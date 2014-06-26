package DAO;

import java.util.List;

import DAO.Interface.IStoreDao;
import DataBase.Store;
import DataBase.User;

public class StoreDaoImpl extends BaseHibernateDAO<Store> implements IStoreDao {

	public Store getStoreByID(String ID) {
		// TODO Auto-generated method stub
		return (Store) super.findByProperty("ID",ID);
	}

	public Store getStoreByName(String Name) {
		// TODO Auto-generated method stub
		return (Store) super.findByProperty("name",Name);
	}

	public Store getStoreByPhone(String Phone) {
		// TODO Auto-generated method stub
		return (Store) super.findByProperty("phone",Phone);
	}

	public boolean saveStore(Store temp) {
		// TODO Auto-generated method stub
		return super.save(temp);
	}

	public boolean updateStore(Store domain) {
		// TODO Auto-generated method stub
		return super.update(domain);
	}

	public boolean delete(Store domain) {
		// TODO Auto-generated method stub
		return super.delete(domain);
	}

	public List<Store> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	public List<Store> findAll(int firstResult, int size) {
		// TODO Auto-generated method stub
		return super.findAll(firstResult, size);
	}

	public List<Store> findByExample(Store domain) {
		// TODO Auto-generated method stub
		return super.findByExample(domain);
	}

	
	public List<Store> findByProperty(String[] propertyNames, Object[] values) {
		// TODO Auto-generated method stub
		return super.findByProperty(propertyNames, values);
	}

}
