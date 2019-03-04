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
@RequestMapping("/categories") 

public class CategoryController {
	@Resource
	CategoryRepository categories;
	@Resource
	ParkRepository parkRepo;
	@Resource
	ReviewRepository reviewRepo;
	
	@GetMapping("/categoryList")
	public String getCategoryList(Model model) {
		model.addAttribute("category", categories.findAll());
		return "/categories/categoryList";
	}
	// "park" see Park model "mapped by"
	@GetMapping("/{id}")
	public String getSpecificCategory(@PathVariable Long id, Model model) {
		model.addAttribute("park", parkRepo.findAllById(id));
		return "/specificCategory";
		
	}

}
