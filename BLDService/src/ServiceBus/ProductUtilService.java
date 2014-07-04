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



import Common.CommonJson;
import Common.IDOperation;
import DAO.DaoFactory;

import DataBase.Product;
import DataBase.User;


@Path("ProductUtilService")
public class ProductUtilService {
	
	@GET
	@Path("getAllProduct")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getAllProduct() throws UnsupportedEncodingException {
		List<Product> list = DaoFactory.getInstance().getProductDao().findAll();
		return URLEncoder.encode(CommonJson.list2Json(list), "utf-8");
	}
	
	
}