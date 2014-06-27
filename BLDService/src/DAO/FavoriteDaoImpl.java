package DAO;

import java.util.List;

import DAO.Interface.IFavoriteDao;
import DataBase.Favorite;

public class FavoriteDaoImpl extends BaseHibernateDAO<Favorite> implements IFavoriteDao{

	public List<Favorite> getFavoriteList(String UserId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean saveFavorite(Favorite temp) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateFavorite(Favorite domain) {
		// TODO Auto-generated method stub
		return false;
	}

}
