package org.wecancodeit.Mod3;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.Mod3.models.Category;
import org.wecancodeit.Mod3.models.Park;
import org.wecancodeit.Mod3.models.Review;
import org.wecancodeit.Mod3.repositories.CategoryRepository;
import org.wecancodeit.Mod3.repositories.ParkRepository;
import org.wecancodeit.Mod3.repositories.ReviewRepository;

@Service
public class Initializer implements CommandLineRunner {

	@Resource
	ParkRepository parkRepo;

	@Resource
	ReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;

	@Override
	public void run(String... args) throws Exception {
		Category category1 = categoryRepo.save(new Category("Dog Park"));
		Category category2 = categoryRepo.save(new Category("Hiking Park"));
		Category category3 = categoryRepo.save(new Category("Bird Watching Park"));
		Category category4 = categoryRepo.save(new Category("Event Park"));
		Category category5 = categoryRepo.save(new Category("Family-Friendly Park"));

		Park park1 = parkRepo.save(new Park("Alum Creek Park"));
		Park park2 = parkRepo.save(new Park("Blendon Woods Metro Park"));
		Park park3 = parkRepo.save(new Park("Highbanks Metro Park"));
		Park park4 = parkRepo.save(new Park("Goodale Park"));
		Park park5 = parkRepo.save(new Park("Fancyberg Park"));

		reviewRepo.save(new Review("Perfect Park", "park.com", "The park is great!", category1, park1));
		reviewRepo.save(new Review("Happy Park", "park.com", "The park is fun!", category2, park2));
		reviewRepo.save(new Review("Confusing Park", "park.com", "The park is not fun!", category3, park3));
		reviewRepo.save(new Review("Excitement Park", "park.com", "The park is too much fun!", category4, park4));
		reviewRepo.save(new Review("Boring Park", "park.com", "I do not like this park!", category5, park5));
	}

}
