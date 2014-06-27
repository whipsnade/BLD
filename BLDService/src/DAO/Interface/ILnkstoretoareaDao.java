package DAO.Interface;

import java.util.List;

import DataBase.Lnkstoretoarea;

public interface ILnkstoretoareaDao extends IBaseHibernateDAO<Lnkstoretoarea> {
	List<Lnkstoretoarea> getStoreList(String areaId);
	
}
