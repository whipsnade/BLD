/** 
 * *************************************************************
 * @FileName:IDOperation.java
 * @Description: ID操作文件
 * @Author: wanghong
 * @Create date: 2014.03.28
 * *************************************************************
 */
package Common;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DAO.DaoFactory;
import DataBase.Classid;

/** 
 * *************************************************************
 * IDOperation为ID操作类，用于生成各数据表的ID字段值
 * @ClassName:IDOperation
 * @Author: wanghong
 * @Create date: 2014.03.28
 * *************************************************************
 */
public class IDOperation {
	
	 /**
     * *************************************************************
	 * FunName : getClassID
     * Description： 获取对应表的ID字段值
     * Input: @param className(数据表名，如“subject”)
     * Output:@param ID值(如“SJ0006”)
     * *************************************************************
	 */
	public static String getClassID(Object obj) {
		String Key="";
        try{
        	String table=obj.getClass().getName();
        	List<Classid> list = DaoFactory.getInstance().getClassidDao().findByProperty("classname", table);
        	if(list!=null && list.size()>0){
        		Classid dst=list.get(0);
        		Key=dst.getKeyword();
        		long record=dst.getRecord()+1;
        		String num = Long.toString(record);
        		for(int i =num.length(); i<dst.getLength();i++){
        			Key+="0";
        		}
        		Key+=num;
        		dst.setRecord(record);
        		DaoFactory.getInstance().getClassidDao().update(dst);
        		return Key;
        	}
        	else{
        		
        	}
        	
			
			
        }catch(Exception e){
        	e.printStackTrace();  
        }
        finally {//保证资源得到释放

        }
        
		return null;
	}
}