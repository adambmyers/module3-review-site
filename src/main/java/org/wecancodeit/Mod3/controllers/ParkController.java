package org.wecancodeit.Mod3.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.Mod3.repositories.CategoryRepository;
import org.wecancodeit.Mod3.repositories.ParkRepository;
import org.wecancodeit.Mod3.repositories.ReviewRepository;

@Controller
public class ParkController {

	@Resource
	CategoryRepository categories;
	@Resource
	ParkRepository parkRepo;
	@Resource
	ReviewRepository reviewRepo;
	
	//navigates to list of reviews for a certain park page, from list of parks page
	@GetMapping("/park/{parkId}")
	public String getReviewsByPark(@PathVariable Long parkId, Model model) {
		model.addAttribute("park", parkRepo.findAllById(parkId));
		return "/park/park";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
