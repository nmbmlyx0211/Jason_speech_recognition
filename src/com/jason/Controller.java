package com.jason;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
@RequestMapping(method = RequestMethod.GET, value = "/")
	public String uploadVideos(){
		return "hello";
	}
}