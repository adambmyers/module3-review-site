package org.wecancodeit.Mod3.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.Mod3.models.Category;
import org.wecancodeit.Mod3.models.Comment;
import org.wecancodeit.Mod3.models.Park;
import org.wecancodeit.Mod3.models.Review;
import org.wecancodeit.Mod3.repositories.CategoryRepository;
import org.wecancodeit.Mod3.repositories.CommentRepository;
import org.wecancodeit.Mod3.repositories.ParkRepository;
import org.wecancodeit.Mod3.repositories.ReviewRepository;

@Controller
public class ReviewController {

	@Resource
	ParkRepository parkRepo;
	
	@Resource
	ReviewRepository reviewRepo; 
	
	@Resource
	CategoryRepository categoryRepo;
	
	@Resource
	CommentRepository commentRepo;
	
	// Model = interface. model = variable to call interface
	// addAttribute common method within Model interface
		// within addAttribute, "parks" = name of the thing we're finding
		// parks.findAll = finding all "parks"
	//pull up specific review
//	@GetMapping("/park/{parkId}")
//	public String getReviewsByPark(@PathVariable Long parkId, Model model) {
//		model.addAttribute("park", parkRepo.findById(parkId).get());
//		return "/park/park";
//	}
	@GetMapping("/reviews/{reviewId}")
	public String getCommentsByReview(@PathVariable Long reviewId, Model model) {
		model.addAttribute("review", reviewRepo.findById(reviewId).get());
		return "/reviews/individualReview";
	}
	
//	@PostMapping("/park/{parkId}")
//	public String addReview(
//			@PathVariable Long parkId,
//			String title, 
//			String imageUrl,
//			String review,
//			Park park
//		) {
//			Park park1 = parkRepo.findById(parkId).get();
//			reviewRepo.save(new Review(title, imageUrl, review, park1));
//			
//return below redirects our review add from above and display it to the page below
//			return "redirect:/park/" + parkId;
//	}

	@PostMapping("/reviews/{reviewId}")
	public String addComment(
			@PathVariable Long reviewId,
			String commentContent,
			Review review
			) {
		Review review1 = reviewRepo.findById(reviewId).get();
		commentRepo.save(new Comment(commentContent, review1));
		return "redirect:/reviews/" + reviewId;
	}
			
}
	
	

