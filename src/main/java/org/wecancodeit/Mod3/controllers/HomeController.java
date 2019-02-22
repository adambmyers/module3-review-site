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

	@Resource
	ParksRepository parks;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin/signin")
	public String signin() {
		return "signin/signin";
	}
	
	@GetMapping("/parks/addParks")
	public String getParkForm(Model model) {
		model.addAttribute("parks", parks.findAll());
		return "parks/addParks";
	}
	
	@PostMapping("/parks/addParks")
	public String addPark(String name, String location, String type) {
		parks.save(new Park(name, location, type));
		return "redirect:/parks/addParks";
	}
	
}
