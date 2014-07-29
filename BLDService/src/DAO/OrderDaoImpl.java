package DAO;

import java.util.List;

import DAO.Interface.IOrderDao;
import DataBase.Order;
import DataBase.Store;
import DataBase.User;

public class OrderDaoImpl extends BaseHibernateDAO<Order> implements IOrderDao {

	public Order getOrderByID(String ID) {
		// TODO Auto-generated method stub
		return (Order) super.findByProperty("ID",ID);
	}

	public Order getOrderByName(String Name) {
		// TODO Auto-generated method stub
		return (Order) super.findByProperty("name",Name);
	}

	public Order getOrderByPhone(String Phone) {
		// TODO Auto-generated method stub
		return (Order) super.findByProperty("phone",Phone);
	}

	public boolean saveOrder(Order temp) {
		// TODO Auto-generated method stub
		return super.save(temp);
	}

	public boolean updateOrder(Order domain) {
		// TODO Auto-generated method stub
		return super.update(domain);
	}

	public boolean delete(Order domain) {
		// TODO Auto-generated method stub
		return super.delete(domain);
	}

	public List<Order> findAll(String orderby, boolean isAsc) {
		// TODO Auto-generated method stub
		return super.findAll(orderby,isAsc);
	}

	public List<Order> findAll(int firstResult, int size,String orderby, boolean isAsc) {
		// TODO Auto-generated method stub
		return super.findAll(firstResult, size,orderby,isAsc);
	}

	public List<Order> findByExample(Order domain) {
		// TODO Auto-generated method stub
		return super.findByExample(domain);
	}

	
	public List<Order> findByProperty(String[] propertyNames, Object[] values) {
		// TODO Auto-generated method stub
		return super.findByProperty(propertyNames, values);
	}

}
