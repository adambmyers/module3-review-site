package org.wecancodeit.Mod3.controllers;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.Mod3.models.Park;
import org.wecancodeit.Mod3.models.Review;
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
		model.addAttribute("park", parkRepo.findById(parkId).get());
		return "/park/park";
	}
	
	//@post allows us to add information to our reviews repo.  
	@PostMapping("/park/{parkId}")
	public String addReview(
			@PathVariable Long parkId,
			String title, 
			String imageUrl,
			String review,
			Park park
		) {
			Park park1 = parkRepo.findById(parkId).get();
			reviewRepo.save(new Review(title, imageUrl, review, park1));
			
//return below redirects our review add from above and display it to the page below
			return "redirect:/park/" + parkId;
	}

}
