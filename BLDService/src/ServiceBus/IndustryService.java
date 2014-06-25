/**
 * *************************************************************
 * @FileName:IndustryService.java
 * @Description:行业业务类web服务接口文件
 * @Author: wanghong
 * @Create date:   2014.02.27
 * *************************************************************
 */
package ServiceBus;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET; 
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Business.Industry;
import Business.Map;
import DataBase.Flow;
import DataBase.Laws;
import DataBase.Policy;
import DataBase.Slrelation;
import DataBase.Sprelation;
import DataBase.Street;
import DataBase.Subject;
import DataBase.Subjecttype;
import java.util.List;
import java.util.ArrayList;

import Common.AreaInfo;
import Common.CommonJson;
import Common.DBOperation;
import Common.IDOperation;

/**
 * *************************************************************
 * IndustryService为行业业务webservice接口，为客户端提供可直接调用的
 * 接口，包括获取行业，及其对应的法律法规和优惠政策等接口
 * @ClassName:IndustryService
 * @Author: wanghong
 * @Create date:   2014.02.27
 * *************************************************************
 */
@Path("IndustryService")
public class IndustryService {
	
	/**
	 * *************************************************************
	 * FunName : getTzjyByInfo
     * Description： 获取行业类别信息
     * Input: 无
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getTzjyByInfo
     * *************************************************************
	 */
	@GET
	@Path("getTzjyByInfo")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getTzjyByInfo(@QueryParam("ids1") String ids1,@QueryParam("ids2") String ids2,
			@QueryParam("lat") double lat,@QueryParam("lng") double lng,@QueryParam("tzr") String tzr) {
		//System.out.println(tzr);
		return null;
	}
	
	/**
	 * *************************************************************
	 * FunName : getZbptAndTzjy
     * Description： 获取周边配套和投资建议
     * Input: 无
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getZbptByPoint
     * *************************************************************
	 */
	@GET
	@Path("getZbptByPoint")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getZbptByPoint(@QueryParam("lat") double lat,@QueryParam("lng") double lng
			,@QueryParam("ptype") String ptype) {
		
		List<AreaInfo> areaInfo= new ArrayList<AreaInfo>();
		if(ptype.equals("null"))
		{
			String listPeitaoStr[]={"学校","公园","医院","交通","小区","商务"};
			try {
				for(int i=0;i<listPeitaoStr.length;i++)
				{
					Map.getPoiByBaidu(lat,lng,listPeitaoStr[i],areaInfo);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				Map.getPoiByBaidu(lat,lng,ptype,areaInfo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String tte=CommonJson.list2Json(areaInfo);
		return CommonJson.list2Json(areaInfo);
	}
	
	/**
	 * *************************************************************
	 * FunName : getIndustryClass
     * Description： 获取行业类别信息
     * Input: 无
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getIndustryClass
     * *************************************************************
	 */
	@GET
	@Path("getIndustryClass")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getIndustryClass() {
		List<Subjecttype> IndustryList = new ArrayList<Subjecttype>();
		Industry.getInstance().getIndustryList(IndustryList);
		return CommonJson.list2Json(IndustryList);
	}
	
	/**
	 * *************************************************************
	 * FunName : getZbptAndTzjy
     * Description： 获取周边配套和投资建议
     * Input: 无
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getZbptAndTzjy
     * *************************************************************
	 */
	@GET
	@Path("getZbptAndTzjy")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getZbptAndTzjy() {
		
		return null;
	}
	
	/**
	 * *************************************************************
	 * FunName : getSubjectList
     * Description： 获取某行业类别的常用行业
     * Input: 无
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getSubjectList?id=
     * *************************************************************
	 */
	@GET
	@Path("getSubjectList")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getSubjectList(@QueryParam("id") String SubjecttypeID) {
		List<Subject> SubjectList = new ArrayList<Subject>();
		Industry.getInstance().getSubjectList(SubjecttypeID,SubjectList);
		return CommonJson.list2Json(SubjectList);
	}
	
	/**
	 * *************************************************************
	 * FunName : getStreetList
     * Description： 获取常用的街道
     * Input: 无
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getStreetList
     * *************************************************************
	 */
	@GET
	@Path("getStreetList")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getStreetList() {
		List<Street> StreetList = new ArrayList<Street>();
		Industry.getInstance().getStreetList(StreetList);
		return CommonJson.list2Json(StreetList);
	}
	/**
	 * 
	 * @return
	 */
	@GET
	@Path("getAllStreetList")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getAllStreetList() {
		List<Street> StreetList	= Industry.getInstance().getAllStreetList();
		return CommonJson.list2Json(StreetList);
	}
	/**
	 * *************************************************************
	 * FunName : getObjectByID
     * Description： 根据行业ID获取行业对象
     * Input: id
     * Output:JSON格式数据
     * Call URL:localhost:8080/Service/IndustryService/getIndustryByID?id=
     * *************************************************************
	 */
	@GET
	@Path("getIndustryByID")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getIndustryByID(@QueryParam("id") String strID){
		return CommonJson.object2Json(Industry.getInstance().getIndustryByID(strID));
	}
	
	/**
	 * *************************************************************
	 * FunName : getObjectByID
     * Description： 根据法规ID获取法规对象
     * Input: id
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getObjectByID?id=
     * *************************************************************
	 */
	@GET
	@Path("getLawByLawID")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getLawByLawID(@QueryParam("id") String strID){
		return CommonJson.object2Json(Industry.getInstance().getLawByLawID(strID));
	}
	
	/**
	 * *************************************************************
	 * FunName : getPolicyByPolicyID
     * Description： 根据政策ID获取政策对象
     * Input: id
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getPolicyByPolicyID?id=
     * *************************************************************
	 */
	@GET
	@Path("getPolicyByPolicyID")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getPolicyByPolicyID(@QueryParam("id") String strID){
		return CommonJson.object2Json(Industry.getInstance().getPolicyByPolicyID(strID));
	}
	
	/**
	 * *************************************************************
	 * FunName : getAddressListByKey
     * Description： 根据关键字获取匹配的行业
     * Input: 关键字
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getIndustryListByKey?key=
     * *************************************************************
	 */
	@GET
	@Path("getIndustryListByKey")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getIndustryListByKey(@QueryParam("key") String strKey) {
		List<String> industryList = new ArrayList<String>();	
		Industry.getInstance().getIndustryListByKey(strKey,industryList);
		return CommonJson.list2Json(industryList);
	}
	
	/**
	 * *************************************************************
	 * FunName : getLawsByIndustryID
     * Description： 根据行业ID获取相关的法律法规
     * Input: 关键字
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getLawsByIndustryID?id=
     * *************************************************************
	 */
	@GET
	@Path("getLawsByIndustryID")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getLawsByIndustryID(@QueryParam("id") String industryID) {
		List<Laws> LawsList = new ArrayList<Laws>();	
		Industry.getInstance().getLawsByIndustryID(industryID,LawsList);
		return CommonJson.list2Json(LawsList);
	}
	
	/**
	 * *************************************************************
	 * FunName : getPolicyByIndustryID
     * Description： 根据行业ID获取相关的政策
     * Input: 关键字
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getPolicyByIndustryID?id=
     * *************************************************************
	 */
	@GET
	@Path("getPolicyByIndustryID")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getPolicyByIndustryID(@QueryParam("id") String industryID) {
		List<Policy> PolicyList = new ArrayList<Policy>();
		Industry.getInstance().getPolicyByIndustryID(industryID,PolicyList);
		return CommonJson.list2Json(PolicyList);
	}
	
	/**
	 * *************************************************************
	 * FunName : getLawsList
     * Description： 获取所有法规列表
     * Input: 无
     * Output:JSON格式数据
     * Call URL:localhost:8080/WebService/IndustryService/getLawsList
     * *************************************************************
	 */
	@GET
	@Path("getLawsList")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getLawsList() {
		List<Laws> LawsList = new ArrayList<Laws>();
		Industry.getInstance().getLawsList(LawsList);
		return CommonJson.list2Json(LawsList);
	}
	
	/**
	 * *************************************************************
	 * FunName : getPolicyList
     * Description： 获取所有政策列表
     * Input: 无
     * Output:JSON格式数据
     * Call URL:localhost:8080/Service/IndustryService/getPolicyList
     * *************************************************************
	 */
	@GET
	@Path("getPolicyList")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String getPolicyList() {
		List<Policy> PolicyList = new ArrayList<Policy>();
		Industry.getInstance().getPolicyList(PolicyList);
		return CommonJson.list2Json(PolicyList);
	}
	
	/**
	 * *************************************************************
	 * FunName : addSubjecttype
     * Description： 增加行业类别信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/addSubjecttype
     * *************************************************************
	 */
	@POST
    @Path("addSubjecttype")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSubjecttype(Subjecttype subjecttype) {
		subjecttype.setId(IDOperation.getClassID("subjecttype"));
		if (DBOperation.add(subjecttype)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : addSubject
     * Description： 增加具体行业信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/addSubject
     * *************************************************************
	 */
	@POST
    @Path("/addSubject")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSubject(Subject subject) {
		subject.setId(IDOperation.getClassID("subject"));
		if (DBOperation.add(subject)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : addLaws
     * Description： 增加法规信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/addLaws
     * *************************************************************
	 */
	@POST
    @Path("/addLaws")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addLaws(String law) {
		Laws bean = (Laws)CommonJson.Json2Obj(law,Laws.class);
		bean.setId(IDOperation.getClassID("Laws"));
        if (DBOperation.add(bean)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : addPolicy
     * Description： 增加优惠政策信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/addPolicy
     * *************************************************************
	 */
	@POST
    @Path("/addPolicy")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addPolicy(String policy) {
		Policy bean = (Policy)CommonJson.Json2Obj(policy,Policy.class);
		bean.setId(IDOperation.getClassID("policy"));
        if (DBOperation.add(bean)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : addSlrelation
     * Description： 增加行业优惠政策关系表记录
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/addSprelation
     * *************************************************************
	 */
	@POST
    @Path("/addSprelation")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSprelation(Sprelation sp) {
		/*增加之前检查对应行业和政策是否存在，不存在则返回行业或政策不存在*/
		if (Industry.getInstance().getIndustryByID(sp.getSid()) == null)
		{
			return Response.status(201).entity("subject not exist").build();
		}
		
		if (Industry.getInstance().getPolicyByPolicyID(sp.getPid()) == null)
		{
			return Response.status(201).entity("policy not exist").build();
		}
		
		sp.setId(IDOperation.getClassID("sprelaion"));
        if (DBOperation.add(sp)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : addSlrelation
     * Description： 增加行业法规关系信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/addSlrelation
     * *************************************************************
	 */
	@POST
    @Path("/addSlrelation")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSlrelation(Slrelation sl) {
		/*增加之前检查对应行业和法规是否存在，不存在则返回行业或法规不存在*/
		if (Industry.getInstance().getIndustryByID(sl.getSid()) == null)
		{
			return Response.status(201).entity("subject not exist").build();
		}
		
		if (Industry.getInstance().getPolicyByPolicyID(sl.getLid()) == null)
		{
			return Response.status(201).entity("policy not exist").build();
		}
		
		sl.setId(IDOperation.getClassID("Slrelation"));
		if (DBOperation.add(sl)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : updateSubjecttype
     * Description： 更新行业类别信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/updateSubjecttype
     * *************************************************************
	 */
	@POST
    @Path("/updateSubjecttype")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateSubjecttype(Subjecttype subjecttype) {
        if (DBOperation.update(subjecttype)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : updateSubject
     * Description： 更新具体行业信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/updateSubject
     * *************************************************************
	 */
	@POST
    @Path("/updateSubject")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateSubject(Subject subject) {
        if (DBOperation.update(subject)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : updateLaws
     * Description： 更新法律法规信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/updateLaws
     * *************************************************************
	 */
	@POST
    @Path("/updateLaws")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateLaws(String laws) {
		Laws bean = (Laws)CommonJson.Json2Obj(laws,Laws.class);
		
        if (DBOperation.update(bean)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : updatePolicy
     * Description： 更新优惠政策信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/updatePolicy
     * *************************************************************
	 */
	@POST
    @Path("/updatePolicy")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePolicy(String policy) {
		Policy bean = (Policy)CommonJson.Json2Obj(policy,Policy.class);
        if (DBOperation.update(bean)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : updateSlrelation
     * Description： 更新行业法规关系表信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/updateSlrelation
     * *************************************************************
	 */
	@POST
    @Path("/updateSlrelation")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateSlrelation(Slrelation sl) {
        if (DBOperation.update(sl)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : updateSprelation
     * Description： 更新行业优惠政策关系表信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/updateSprelation
     * *************************************************************
	 */
	@POST
    @Path("/updateSprelation")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateSprelation(Sprelation sp) {
        if (DBOperation.update(sp)) {
        	return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
    }
	
	/**
	 * *************************************************************
	 * FunName : deleteSubject
     * Description： 删除具体行业
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/deleteSubject?id=
     * *************************************************************
	 */
	@GET
	@Path("deleteSubject")
	public Response deleteSubjecttype(@QueryParam("id") String SubjectID) {
		/*删除行业后没有检查行业法规关系表和行业政策关系表中是否有对应行业的记录，若有应将其删掉*/
		if (Industry.getInstance().deleteSubject(SubjectID)) {
			return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
	}
	
	/**
	 * *************************************************************
	 * FunName : deleteLaws
     * Description： 删除法规信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/deleteLaws?id=
     * *************************************************************
	 */
	@GET
	@Path("deleteLaws")
	public Response deleteLaws(@QueryParam("id") String lawID) {
		/*删除法规后没有检查行业法规关系表中是否有对应法律的记录，若有应将其删掉*/
		if (Industry.getInstance().deleteSubject(lawID)) {
			return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
	}
	
	/**
	 * *************************************************************
	 * FunName : deletePolicy
     * Description： 删除法规信息
     * Input: JSON格式数据
     * Output:
     * Call URL:localhost:8080/Service/IndustryService/deletePolicy?id=
     * *************************************************************
	 */
	@GET
	@Path("deletePolicy")
	public Response deletePolicy(@QueryParam("id") String policyID) {
		/*删除政策后没有检查行业政策关系表中是否有对应政策的记录，若有应将其删掉*/
		if (Industry.getInstance().deletePolicy(policyID)) {
			return Response.status(201).entity("Seccess").build();
        }
        else
        {
        	return Response.status(201).entity("Failure").build();
        }
	}
}
