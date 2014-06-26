package Business;

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
}
