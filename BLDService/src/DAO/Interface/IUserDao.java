package DAO.Interface;

import DataBase.User;

public interface IUserDao extends IBaseHibernateDAO<User> {
	User getUserByID(String ID);
	User getUserByName(String Name);
	User getUserByPhone(String Phone);
	boolean saveUser(User temp);
	boolean updateUser(User domain);
	
}
