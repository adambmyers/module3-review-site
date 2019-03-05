package org.wecancodeit.Mod3.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.Mod3.repositories.CategoryRepository;
import org.wecancodeit.Mod3.repositories.ParkRepository;
import org.wecancodeit.Mod3.repositories.ReviewRepository;

@Controller
//@RequestMapping("/categories") 

public class CategoryController {
	@Resource
	CategoryRepository categories;
	@Resource
	ParkRepository parkRepo;
	@Resource
	ReviewRepository reviewRepo;
	
	//gets a list of all categories on the categoryList html page
	@GetMapping("/categories/categoryList")
	public String getCategoryList(Model model) {
		model.addAttribute("category", categories.findAll());
		return "/categories/categoryList";
	}
	
	//navigates to the page of a specific category and shows all parks in the category
	@GetMapping("/categories/{categoryId}")
	public String getParksByCategory(@PathVariable Long categoryId, Model model) {
		model.addAttribute("category", categories.findAllById(categoryId));
		return "/categories/specificCategory";	
	}

}
