package Business;

import java.util.ArrayList;
import java.util.List;

import DAO.DaoFactory;
import DataBase.Product;

public class ProductOperator {
	private static ProductOperator m_Instance = null;
	 
    private ProductOperator() {
    	
    }
    
    public static ProductOperator getInstance() {
        if (m_Instance == null) {
        	m_Instance = new ProductOperator();
        }
        
        return m_Instance;
    }
    
    public List<Product> getProductByIDs(String ids){
    	List<Product> list = new ArrayList<Product>();
    	
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
