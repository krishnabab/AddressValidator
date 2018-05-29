package com.krish.hystrix.address.validator;

import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddrController {
	@RequestMapping("/address")
	@Produces({MediaType.TEXT_PLAIN})
	public String validateOrder() {
		try {
			//Thread.sleep(7000);
			System.out.println("in Address Validator : "+System.currentTimeMillis()); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		//throw new InternalServerErrorException();
		return "Address Validated!!";
	}
}
