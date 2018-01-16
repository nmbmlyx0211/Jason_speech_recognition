package com.jason;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	WelcomeService welcomeService = new WelcomeService();
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String welcome(){
		return welcomeService.printHello();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/welcome")
	public String welcomeWithName(@RequestParam(value = "name", defaultValue = "world") String name){
		return welcomeService.printName(name);
	}
}