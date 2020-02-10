package in.nit.controller.JerseyQuickApp;

import java.util.concurrent.TimeUnit;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/convert")
public class DaysRestController {
@POST
public String showData(
		@FormParam("days")int days,
		@FormParam("fact")String fact
		)
{
	String message=null;
	long count=0;
	switch (fact) {
	case "HRS":count=TimeUnit.DAYS.toHours(days);
		break;
	case "MIN":count=TimeUnit.DAYS.toMinutes(days);
	break;
	case "SEC":count=TimeUnit.DAYS.toSeconds(days);
	break;
	case "MIL":count=TimeUnit.DAYS.toMillis(days);
	break;
	default:count=-1L;
		break;
	}
	if(count>0)
		message="the value conversion is"+count;
	else
		message="Invalid value";

	return message;
}
}
