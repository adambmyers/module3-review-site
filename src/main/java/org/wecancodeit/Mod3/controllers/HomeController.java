package org.wecancodeit.Mod3.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.Mod3.models.Park;
import org.wecancodeit.Mod3.repositories.ParksRepositories;

@Controller

public class HomeController {

	private ParksRepositories parks = new ParksRepositories(new ArrayList<Park>());
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String signin() {

		return "redirect:signin";

	}
	
	@GetMapping("/parks/addParks")
	public String getParkForm(Model model) {
		model.addAttribute("parks", parks.getParks());
		return "parks/addParks";
	}
	
	@PostMapping("/parks/addParks")
	public String addPark(String name, String location, String type) {
		parks.addPark(new Park(name, location, type));
		return "redirect:/parks/addParks";
	}
	
	
}
