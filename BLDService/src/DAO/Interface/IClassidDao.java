package DAO.Interface;

import DataBase.Classid;

public interface IClassidDao extends IBaseHibernateDAO<Classid> {
	Classid getClassidByID(String ID);
	Classid getClassidByName(String Name);
	Classid getClassidByPhone(String Phone);
	boolean saveClassid(Classid temp);
	boolean updateClassid(Classid domain);
	
}
