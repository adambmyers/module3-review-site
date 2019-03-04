package org.wecancodeit.Mod3.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.Mod3.models.Category;
import org.wecancodeit.Mod3.models.Park;
import org.wecancodeit.Mod3.models.Review;
import org.wecancodeit.Mod3.repositories.CategoryRepository;
import org.wecancodeit.Mod3.repositories.ParkRepository;
import org.wecancodeit.Mod3.repositories.ReviewRepository;

@Controller
@RequestMapping("/reviews")
public class ReviewController {

	@Resource
	ParkRepository parkRepo;
	
	@Resource
	ReviewRepository reviewRepo; 
	
	@Resource
	CategoryRepository categoryRepo;
	
	// Model = interface. model = variable to call interface
	// addAttribute common method within Model interface
		// within addAttribute, "parks" = name of the thing we're finding
		// parks.findAll = finding all "parks"
	//pull up specific review
	@GetMapping("/review/{id}")
	public String getReview(@PathVariable Long id, Model model) {
		model.addAttribute("review", reviewRepo.findById(id).get());
		return "/review/individualReview";
	}
	
	@GetMapping("/addReview")
	public String getParkForm(Model model) {
		model.addAttribute("parks", parkRepo.findAll());
		return "parks/addReview";
	}
	
	//@post allows us to add information to our reviews repo.  See PostMapping in addReview
	@PostMapping("/addReview")
	public String addPark(
			String title, 
			String imageUrl,
			String review,
			String categoryName,
			String parkName
			
		) {
			
			Category category = categoryRepo.findByCategoryName(categoryName); //addGet
//			category = categoryRepo.save(new Category(categoryName));
		
			Park park = parkRepo.findByParkName(parkName);
//			park = parkRepo.save(new Park(parkName); 
			
	
			
			reviewRepo.save(new Review(title, imageUrl, review, category, park));
//return below redirects our review add from above and display it to the page below
			return "redirect:/parks/addReview";
	}

}
	
	

