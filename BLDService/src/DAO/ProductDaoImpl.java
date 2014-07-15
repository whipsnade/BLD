package DAO;

import java.util.List;

import DAO.Interface.IProductDao;
import DataBase.Favorite;
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

	public List<Product> getProductListByFavorite(List<Favorite> flist) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProductListByStoreId(String StoreId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductByCode(String code) {
		// TODO Auto-generated method stub
		List<Product> list = super.findByProperty("code",code);
		if(list !=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
