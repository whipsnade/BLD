package DAO.Interface;


import java.util.List;

import DataBase.Favorite;
import DataBase.Product;

public interface IProductDao extends IBaseHibernateDAO<Product> {
	Product getProductByID(String ID);
	Product getProductByName(String Name);
	List<Product> getProductListByStoreId(String StoreId);
	List<Product> getProductListByFavorite(List<Favorite> flist);
	
}
