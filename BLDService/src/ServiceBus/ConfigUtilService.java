package ServiceBus;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



import Business.UserOperator;
import Common.CommonJson;
import Common.IDOperation;
import DAO.DaoFactory;
import DAO.Interface.IUserDao;

import DataBase.Complaint;
import DataBase.User;


@Path("ConfigUtilService")
public class ConfigUtilService {


	@GET
	@Path("getIconList")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getIconList() {
		List<User> list = UserOperator.getInstance().getAllUser();
		String ID = IDOperation.getClassID(new User());
		Complaint domain = new Complaint();
		domain.setComments("aaa");
		domain.setOrderId("1");
		DaoFactory.getInstance().getComplaintDao().save(domain);

		return CommonJson.list2Json(list);
	}
	
	
}
