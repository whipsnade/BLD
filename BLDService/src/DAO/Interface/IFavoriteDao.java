package DAO.Interface;

import java.util.List;

import DataBase.Favorite;

public interface IFavoriteDao extends IBaseHibernateDAO<Favorite> {
	List<Favorite> getFavoriteList(String UserId);
	
	boolean saveFavorite(Favorite temp);
	boolean updateFavorite(Favorite domain);
	
}
