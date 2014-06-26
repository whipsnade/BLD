package Business;

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
}
