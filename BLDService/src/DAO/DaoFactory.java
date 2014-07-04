package DAO;

import DAO.Interface.*;

import DataBase.*;

public class DaoFactory {
	private static DaoFactory m_Instance = null;
	IUserDao user_dao;
	IStoreDao store_dao;
	IOrderDao order_dao;
	IProductDao product_dao;
	IClassidDao class_dao;
	IAddressDao address_dao;
	ILnkordertoproductDao lnkorder_pro_dao;
	IFavoriteDao favorite_dao;
	ILnkstoretoareaDao lnk_store_area_dao;
	ILnkstoretoproductDao lnk_store_product_dao;
	IProductClassDao product_class_dao;
	IReturnOrderDao return_order_dao;
	IWaiterDao waiter_dao;
	
    private DaoFactory() {
    	
    }
    
    public static DaoFactory getInstance() {
        if (m_Instance == null) {
        	m_Instance = new DaoFactory();
        }
        
        return m_Instance;
    }
    
    public IUserDao getUserDao(){
    	if(user_dao==null){
    		user_dao= new UserDaoImpl();
    	}
    		return user_dao;
    }
    
    public IStoreDao  getStoreDao(){
    	if(store_dao==null){
    		store_dao= new StoreDaoImpl();
    	}
    		return store_dao;
    	
    }
    public IOrderDao  getOrderDao(){
    	if(order_dao==null){
    		order_dao= new OrderDaoImpl();
    	}
    		return order_dao;
    }
    public IProductDao  getProductDao(){
    	if(product_dao==null){
    		product_dao= new ProductDaoImpl();
    	}
    		return product_dao;
    }
    public IAddressDao  getAddressDao(){
    	if(address_dao==null){
    		address_dao = new AddressDaoImpl();
    	}
    		return address_dao;
    }
    
    public IClassidDao  getClassidDao(){
    	if(class_dao==null){
    		class_dao = new ClassidDaoImpl();
    	}
    		return class_dao;
    }
    
    public IBaseHibernateDAO<Complaint>  getComplaintDao(){
    	return new BaseHibernateDAO<Complaint>();
    }
    
    public IFavoriteDao  getFavoriteDao(){
    	if(favorite_dao==null){
    		favorite_dao = new FavoriteDaoImpl();
    	}
    		return favorite_dao;
    }
    
    public ILnkordertoproductDao getLnkordertoproductDao(){
    	if(lnkorder_pro_dao==null){
    		lnkorder_pro_dao = new LnkordertoproductDaoImpl();
    	}
    		return lnkorder_pro_dao;
    	
    }
    
    public ILnkstoretoareaDao  getLnkstoretoareaDao(){
    	
    	if(lnk_store_area_dao==null){
    		lnk_store_area_dao = new LnkstoretoareaDaoImpl();
    	}
    		return lnk_store_area_dao;
    }
    
    public ILnkstoretoproductDao getLnkstoretoproductDao(){
    	
    	if(lnk_store_product_dao==null){
    		lnk_store_product_dao = new LnkstoretoproductDaoImpl();
    	}
    		return lnk_store_product_dao;
    }
    
    public IProductClassDao  getProductClassDao(){
    	 
    	 if(product_class_dao==null){
    		 product_class_dao = new ProductClassDaoImpl();
     	}
     		return product_class_dao;
    }
    
    public IReturnOrderDao  getReturnorderDao(){
    	 
    	 if(return_order_dao==null){
    		 return_order_dao = new ReturnOrderDaoImpl();
     	}
     		return return_order_dao;
    }
    
    public IWaiterDao  getWaiterDao(){
    	 
    	 if(waiter_dao==null){
    		 waiter_dao = new WaiterDaoImpl();
     	}
     		return waiter_dao;
    }
    
    public IBaseHibernateDAO<Master>  getMasterDao(){
    	return new BaseHibernateDAO<Master>();
    }
}
