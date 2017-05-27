package cphbusiness.test.sp5.systemtesting.controller;

import javax.ejb.Stateless;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;

@Stateless
public class InterestController {

	Gson gson = new Gson();

	public ResponseBuilder getInterest(int balance) {
		System.out.println(balance);
		int result = 0;
		if (balance > 0 && balance <= 100) {
			result = 3;
		} else if (balance > 100 && balance < 1000) {
			result = 5;
		} else if (balance > 1000) {
			result = 7;
		}
System.out.println(result);
		return Response.status(Status.OK).entity(gson.toJson(result));
	}


	public ResponseBuilder getDiscount(boolean newcus, boolean loyal, boolean coop) {
		int discount = 0;
		if (newcus && !loyal && !coop) {
			discount = 15;
		} else if (newcus && !loyal && coop) {
			discount = 20;
		} else if (!newcus && loyal && coop) {
			discount = 30;
		} else if (!newcus && loyal && !coop) {
			discount = 10;
		} else if (!newcus && !loyal && coop) {
			discount = 20;
		}
		return Response.status(Status.OK).entity(gson.toJson(discount));
	}

}
