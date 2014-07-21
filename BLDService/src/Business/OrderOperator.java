package Business;

import java.util.ArrayList;
import java.util.List;

import DAO.DaoFactory;
import DAO.ProductDaoImpl;
import DataBase.Product;



public class OrderOperator {
	private static OrderOperator m_Instance = null;
	 
    private OrderOperator() {
    	
    }
    
    public static OrderOperator getInstance() {
        if (m_Instance == null) {
        	m_Instance = new OrderOperator();
        }
        
        return m_Instance;
    }
    
    
    public List<Product> createOrder(String ids,String latitude,String longitude){
    	List<Product> list = new ArrayList<Product>();
    	//TODO:
    	//添加区域店铺搜索，发送店铺接单通知
    	//设置商品的店铺价格
    	//.........................
    	String[] id_list = ids.split(",");
    	for(int i=0;i<id_list.length;i++){
    		Product temp =DaoFactory.getInstance().getProductDao().getProductByID(id_list[i]);
    		if(temp !=null){
    			list.add(temp);
    		}
    	}
    	
    	return list;
    }
}
