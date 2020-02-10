package in.nit.controller.JerseyQuickApp;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/def")
public class ParamDefRestController {
	@GET
	@Path("/query")
	public String readQparams(
			@DefaultValue("None")
			@QueryParam("pcode") String code,
			@DefaultValue("5.0")
			@QueryParam("disc")double dis
			)
	{
		return "Data:"+code+"-"+dis;
	}
	@GET
	@Path("/mtx")
	public String readMparams(
			@DefaultValue("ACTIVE")
			@MatrixParam("pmode")String code,
			@DefaultValue("8.0")
			@MatrixParam("gst")double dis
			)
	{
		return "Data:"+code+"-"+dis;
	}

}
