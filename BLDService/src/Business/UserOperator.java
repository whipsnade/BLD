package Business;

import java.util.List;

import DAO.DaoFactory;
import DataBase.Favorite;
import DataBase.Product;
import DataBase.User;

public class UserOperator {
	private static UserOperator m_Instance = null;
	 
    private UserOperator() {
    	
    }
    
    public static UserOperator getInstance() {
        if (m_Instance == null) {
        	m_Instance = new UserOperator();
        }
        
        return m_Instance;
    }
    
    public User SignIn(String phone,String password){
    	return null;
    	
    }
    
    public User SignUp(String phone,String name,String password){
    
    	return null;
    }
    
    public List<Product> getFavoriteList(String userID){
    	List<Favorite> flist= DaoFactory.getInstance().getFavoriteDao().getFavoriteList(userID);
    	return DaoFactory.getInstance().getProductDao().getProductListByFavorite(flist);
    	
    }
    
    public List<User> getAllUser(){
    	return DaoFactory.getInstance().getUserDao().findAll();
    }
	
}
