package DAO;

import java.util.List;

import DAO.Interface.IProductDao;
import DataBase.Order;
import DataBase.Product;
import DataBase.Store;
import DataBase.User;

public class ProductDaoImpl extends BaseHibernateDAO<Product> implements IProductDao {

	public Product getProductByID(String ID) {
		// TODO Auto-generated method stub
		return (Product) super.findByProperty("ID",ID);
	}

	public Product getProductByName(String Name) {
		// TODO Auto-generated method stub
		return (Product) super.findByProperty("name",Name);
	}

	public Product getProductByPhone(String Phone) {
		// TODO Auto-generated method stub
		return (Product) super.findByProperty("phone",Phone);
	}

	public boolean saveProduct(Product temp) {
		// TODO Auto-generated method stub
		return super.save(temp);
	}

	public boolean updateProduct(Product domain) {
		// TODO Auto-generated method stub
		return super.update(domain);
	}

	public boolean delete(Product domain) {
		// TODO Auto-generated method stub
		return super.delete(domain);
	}

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	public List<Product> findAll(int firstResult, int size) {
		// TODO Auto-generated method stub
		return super.findAll(firstResult, size);
	}

	public List<Product> findByExample(Product domain) {
		// TODO Auto-generated method stub
		return super.findByExample(domain);
	}

	
	public List<Product> findByProperty(String[] propertyNames, Object[] values) {
		// TODO Auto-generated method stub
		return super.findByProperty(propertyNames, values);
	}

}
