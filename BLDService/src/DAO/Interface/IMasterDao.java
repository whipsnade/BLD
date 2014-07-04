package DAO.Interface;

import DataBase.Master;

public interface IMasterDao extends IBaseHibernateDAO<Master> {
	Master getMasterByID(String ID);
	Master getMasterByName(String Name);
	Master getMasterByPhone(String Phone);
	Master getMasterByStoreId(String StoreId);

	
}
