package DAO.Interface;

import DataBase.Store;

public interface IStoreDao extends IBaseHibernateDAO<Store> {
	Store getStoreByID(String ID);
	Store getStoreByName(String Name);
	Store getStoreByPhone(String Phone);
	boolean saveStore(Store temp);
	boolean updateStore(Store domain);
	
}
