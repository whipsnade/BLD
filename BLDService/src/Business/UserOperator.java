package Business;

public class UserOperator {
	private static UserOperator m_Instance = null;
	 
    private UserOperator() {
    	
    }
    
    public static UserOperator getInstance() {
        if (m_Instance == null) {
        	m_Instance = new UserOperator();
        }
        
        return m_Instance;
    }
	
}
