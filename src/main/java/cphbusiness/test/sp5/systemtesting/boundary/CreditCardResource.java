package cphbusiness.test.sp5.systemtesting.boundary;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cphbusiness.test.sp5.systemtesting.controller.CreditCardController;

@Produces(MediaType.APPLICATION_JSON)
@Path("/creditcard")
public class CreditCardResource {

	@Inject
	CreditCardController controller;

}
