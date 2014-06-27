package DAO.Interface;

import java.util.List;

import DataBase.Lnkstoretoproduct;

public interface ILnkstoretoproductDao extends IBaseHibernateDAO<Lnkstoretoproduct> {
	List<Lnkstoretoproduct> getProductIdList(String storeId);
	
}
