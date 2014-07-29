package ServiceBus;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import Business.StoreOperator;
import Common.CommonJson;
import DAO.DaoFactory;
import DataBase.Product;
import DataBase.Store;
import DataBase.Waiter;


@Path("StoreUtilService")
public class StoreUtilService {

	@GET
	@Path("getAllStore")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getAllStore()
			throws UnsupportedEncodingException {
		List<Store> StoreList = StoreOperator.getInstance().getAllStore();
		return URLEncoder.encode(CommonJson.list2Json(StoreList), "utf-8");
		//return CommonJson.list2Json(product);
	}
	
	@GET
	@Path("getWaiterByStore")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getWaiterByStore(@QueryParam("id") String id) throws UnsupportedEncodingException {
		List<Waiter> list= StoreOperator.getInstance().getWaiterByStore(id);
		return URLEncoder.encode(CommonJson.list2Json(list), "utf-8");
	}
}
