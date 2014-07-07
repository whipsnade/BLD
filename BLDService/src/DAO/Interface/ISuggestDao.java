package DAO.Interface;

import DataBase.Suggest;

public interface ISuggestDao extends IBaseHibernateDAO<Suggest> {
	Suggest getSuggestByID(String ID);
}
