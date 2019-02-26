package org.wecancodeit.Mod3.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.Mod3.models.Park;
import org.wecancodeit.Mod3.repositories.ParksRepository;

@Controller

public class HomeController {

//	//instantiates collection of name parks 
//	@Resource
//	ParksRepository parks;
	
	//@getmapping is used to pull info only and display it.  "/" is to pull the home page, index.html
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
//	@GetMapping("/signin/signin")
//	public String signin() {
//		return "signin/signin";
//	}
	
	
}
