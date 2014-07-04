package DAO.Interface;


import java.util.List;

import DataBase.ProductClass;

public interface IProductClassDao extends IBaseHibernateDAO<ProductClass> {
	ProductClass getProductClassByID(String ID);
	List<ProductClass> getSubProductClassByParentID(String ID);
	
}
