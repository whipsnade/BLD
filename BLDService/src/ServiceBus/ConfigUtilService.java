package ServiceBus;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import Common.CommonJson;
import Common.IDOperation;
import DAO.DaoFactory;
import DAO.UserDaoImpl;

import DataBase.Complaint;
import DataBase.User;


@Path("ConfigUtilService")
public class ConfigUtilService {
	 @Autowired
	    private UserDaoImpl UserDao;

	@GET
	@Path("getIconList")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getIconList() {
		List<User> list = DaoFactory.getInstance().getUserDao().findAll();
		String ID = IDOperation.getClassID(new User());
		Complaint domain = new Complaint();
		domain.setComments("aaa");
		domain.setOrderId("1");
		DaoFactory.getInstance().getComplaintDao().save(domain);

		return CommonJson.list2Json(list);
	}
	
	
}
