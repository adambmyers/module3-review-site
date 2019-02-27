package org.wecancodeit.Mod3.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.Mod3.repositories.ReviewsRepository;

@Controller
public class ReviewController {

	@Resource
	ReviewsRepository reviews;
	
	@GetMapping("/review/{id}")
	public String getReview(@PathVariable Long id, Model model) {
		model.addAttribute("review", reviews.findById(id).get());
		return "/review/individualReview";
	}
	
	@PostMapping("review/")
	public String getReviews() {
		
	}
}
