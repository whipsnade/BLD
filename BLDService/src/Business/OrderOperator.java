package Business;

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
}
