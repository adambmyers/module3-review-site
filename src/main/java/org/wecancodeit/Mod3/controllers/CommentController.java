package org.wecancodeit.Mod3.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.wecancodeit.Mod3.repositories.CategoryRepository;
import org.wecancodeit.Mod3.repositories.CommentRepository;
import org.wecancodeit.Mod3.repositories.ParkRepository;
import org.wecancodeit.Mod3.repositories.ReviewRepository;

@Controller
public class CommentController {
	
	@Resource
	CategoryRepository categories;
	@Resource
	ParkRepository parkRepo;
	@Resource
	ReviewRepository reviewRepo;
	@Resource
	CommentRepository commentRepo;

}
