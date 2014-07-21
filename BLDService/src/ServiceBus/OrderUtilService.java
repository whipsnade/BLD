package ServiceBus;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import Business.OrderOperator;
import Common.CommonJson;
import Common.IDOperation;
import DAO.DaoFactory;

import DataBase.Product;
import DataBase.Suggest;
import DataBase.User;

@Path("OrderUtilService")
public class OrderUtilService {

	@GET
	@Path("createOrder")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String createOrder(@QueryParam("ids") String ids,
			@QueryParam("latitude") String latitude,
			@QueryParam("longitude") String longitude)
			throws UnsupportedEncodingException {
		List<Product> product = OrderOperator.getInstance().createOrder(ids, latitude, longitude);
		return URLEncoder.encode(CommonJson.list2Json(product), "utf-8");
		//return CommonJson.list2Json(product);
	}
}
