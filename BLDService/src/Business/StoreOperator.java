package Business;

import java.util.ArrayList;
import java.util.List;

import DAO.DaoFactory;
import DataBase.Store;
import DataBase.Waiter;

public class StoreOperator {
	private static StoreOperator m_Instance = null;
	 
    private StoreOperator() {
    	
    }
    
    public static StoreOperator getInstance() {
        if (m_Instance == null) {
        	m_Instance = new StoreOperator();
        }
        
        return m_Instance;
    }
    
    public List<Waiter> getWaiterByStore(String id){
    	List<Waiter> list = new ArrayList<Waiter>();
    	list=(List<Waiter>) DaoFactory.getInstance().getWaiterDao().getWaiterByStoreId(id);
    	return list;
    }
    
    public List<Store> getAllStore(){
    	List<Store> StoreList = new ArrayList<Store>(); 
    	StoreList = DaoFactory.getInstance().getStoreDao().findAll("id",true);
    	return StoreList; 
    }
}
