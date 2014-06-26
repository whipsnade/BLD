package DAO.Interface;


import DataBase.Product;

public interface IProductDao extends IBaseHibernateDAO<Product> {
	Product getProductByID(String ID);
	Product getProductByName(String Name);
	Product getProductByPhone(String Phone);
	boolean saveProduct(Product temp);
	boolean updateProduct(Product domain);
	
}
