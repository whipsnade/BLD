package DAO;

import java.util.List;

import DAO.Interface.IUserDao;
import DataBase.User;

public class UserDaoImpl extends BaseHibernateDAO<User> implements IUserDao {

	public User getUserByID(String ID) {
		// TODO Auto-generated method stub
		return (User) super.findByProperty("ID",ID);
	}

	public User getUserByName(String Name) {
		// TODO Auto-generated method stub
		return (User) super.findByProperty("name",Name);
	}

	public User getUserByPhone(String Phone) {
		// TODO Auto-generated method stub
		return (User) super.findByProperty("phone",Phone);
	}

	public boolean saveUser(User temp) {
		// TODO Auto-generated method stub
		return super.save(temp);
	}

	public boolean updateUser(User domain) {
		// TODO Auto-generated method stub
		return super.update(domain);
	}

	public boolean delete(User domain) {
		// TODO Auto-generated method stub
		return super.delete(domain);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	public List<User> findAll(int firstResult, int size) {
		// TODO Auto-generated method stub
		return super.findAll(firstResult, size);
	}

	public List<User> findByExample(User domain) {
		// TODO Auto-generated method stub
		return super.findByExample(domain);
	}

	
	public List<User> findByProperty(String[] propertyNames, Object[] values) {
		// TODO Auto-generated method stub
		return super.findByProperty(propertyNames, values);
	}

}
