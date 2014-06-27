package DAO.Interface;

import DataBase.Lnkordertoproduct;

public interface ILnkordertoproductDao extends IBaseHibernateDAO<Lnkordertoproduct> {
	Lnkordertoproduct getLnkordertoproductByID(String ID);
	Lnkordertoproduct getLnkordertoproductByName(String Name);
	Lnkordertoproduct getLnkordertoproductByPhone(String Phone);
	boolean saveLnkordertoproduct(Lnkordertoproduct temp);
	boolean updateLnkordertoproduct(Lnkordertoproduct domain);
	
}
