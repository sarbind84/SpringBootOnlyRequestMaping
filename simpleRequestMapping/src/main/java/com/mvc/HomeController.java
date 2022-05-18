package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {

	@RequestMapping("/user")
	public String getUser() {
		return "getUser()";
	}
	
	@RequestMapping(value = {"/seconduser", "/second-user", "/secondUser"}, 
					method = RequestMethod.GET)
	public String getSecondUser() {
		return "getSecondUser()";
	}
}