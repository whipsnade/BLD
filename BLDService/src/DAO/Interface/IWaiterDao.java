package DAO.Interface;

import java.util.List;

import DataBase.Waiter;

public interface IWaiterDao extends IBaseHibernateDAO<Waiter> {
	Waiter getWaiterByID(String ID);
	Waiter getWaiterByName(String Name);
	Waiter getWaiterByPhone(String Phone);
	List<Waiter> getWaiterByStoreId(String StoreId);

	
}
