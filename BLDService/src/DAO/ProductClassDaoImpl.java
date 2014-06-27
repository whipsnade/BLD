package DAO;

import java.util.List;

import DAO.Interface.IProductClassDao;
import DataBase.ProductClass;


public class ProductClassDaoImpl extends BaseHibernateDAO<ProductClass> implements IProductClassDao {

	public ProductClass getProductClassByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProductClass> getSubProductClassByParentID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
