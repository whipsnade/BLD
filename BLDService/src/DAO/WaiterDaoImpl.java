package DAO;

import java.util.List;

import DAO.Interface.IWaiterDao;
import DataBase.Waiter;

public class WaiterDaoImpl extends BaseHibernateDAO<Waiter> implements IWaiterDao {

	public Waiter getWaiterByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	public Waiter getWaiterByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Waiter getWaiterByPhone(String Phone) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Waiter> getWaiterByStoreId(String StoreId) {
		// TODO Auto-generated method stub
		return super.findByProperty("storeId",StoreId);
	}

}
