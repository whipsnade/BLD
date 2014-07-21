package DAO.Interface;

import java.util.List;

import DataBase.Order;
import DataBase.Product;

public interface IOrderDao extends IBaseHibernateDAO<Order> {
	Order getOrderByID(String ID);
	Order getOrderByName(String Name);
	Order getOrderByPhone(String Phone);
	boolean saveOrder(Order temp);
	boolean updateOrder(Order domain);
	
}
