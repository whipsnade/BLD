package DAO.Interface;


import java.util.List;

import DataBase.Returnorder;

public interface IReturnOrderDao extends IBaseHibernateDAO<Returnorder> {
	Returnorder getReturnorderByID(String ID);
	List<Returnorder> getListbyUserId(String ID);
	List<Returnorder> getListbyOrderId(String ID);
	
}
