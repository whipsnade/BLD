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
import DataBase.Suggest;
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
	
	@GET
	@Path("getAllSuggest")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getAllSuggest() throws UnsupportedEncodingException {
		List<Suggest> list = DaoFactory.getInstance().getSuggestDao().findAll();
		return URLEncoder.encode(CommonJson.list2Json(list), "utf-8");
	}
	
	
	@GET
	@Path("getProductByCode")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getProductByCode(@QueryParam("code") String code) throws UnsupportedEncodingException {
		Product product = DaoFactory.getInstance().getProductDao().getProductByCode(code);
		return URLEncoder.encode(CommonJson.object2Json(product), "utf-8");
	}
}
