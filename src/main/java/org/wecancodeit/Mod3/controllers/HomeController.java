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

	//instantiates collection of name parks 
	@Resource
	ParksRepository parks;
	
	//@getmapping is used to pull info only and display it.  "/" is to pull the home page, index.html
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin/signin")
	public String signin() {
		return "signin/signin";
	}
	
	@GetMapping("/parks/addReview")
	// Model = interface. model = variable to call interface
	// addAttribute common method within Model interface
	public String getParkForm(Model model) {
		// within addAttribute, "parks" = name of the thing we're finding
		// parks.findAll = finding all "parks"
		model.addAttribute("parks", parks.findAll());
		return "parks/addReview";
	}
	
	//@post allows us to add information to our reviews repo.  
	@PostMapping("/parks/addReview")
	public String addPark(String name, String location, String type) {
		parks.save(new Park(name, location, type));
		//return below redirects our review add from above and display it to the page below
		return "redirect:/parks/addReview";
	}
	
}
