package cphbusiness.test.sp5.systemtesting.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cphbusiness.test.sp5.systemtesting.controller.InterestController;

@Produces(MediaType.APPLICATION_JSON)
@Path("")
public class InterestResource {

	InterestController controller = new InterestController();

	@GET
	@Path("interest")
	public Response getInterest(@QueryParam("balance") int balance) {
		return controller.getInterest(balance).build();
	}

	@GET
	@Path("discount")
	public Response getInterest(@QueryParam("newcus") boolean newcus, @QueryParam("loyal") boolean loyal,
			@QueryParam("coop") boolean coop) {
		return controller.getDiscount(newcus, loyal, coop).build();
	}

}
