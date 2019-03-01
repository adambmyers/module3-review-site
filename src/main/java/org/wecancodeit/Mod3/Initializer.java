package org.wecancodeit.Mod3;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.Mod3.models.Category;
import org.wecancodeit.Mod3.models.Comment;
import org.wecancodeit.Mod3.models.Park;
import org.wecancodeit.Mod3.models.Review;
import org.wecancodeit.Mod3.repositories.CategoryRepository;
import org.wecancodeit.Mod3.repositories.CommentRepository;
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
	
	@Resource
	CommentRepository commentRepo;

	@Override            //jdbc:h2:mem:testdb
	public void run(String... args) throws Exception {

		Category category1 = categoryRepo.save(new Category("Dog Parks", "We know how much dogs love to go to the park! These parks have off-the-leash areas where your furry friend can really enjoy themselves. You can help develop a dogs' positive behavior by letting them socialize, and perhaps you may even make a friend of your own."));
		Category category2 = categoryRepo.save(new Category("Hiking Parks", "In a city surrounded by great parks, adventure is never far away. And we've made it even easier to find with our list of incredible Columbus hiking spots!"));
		Category category3 = categoryRepo.save(new Category("Bird Watching Parks", "Are you a bird lover looking for the best bird watching spots in Columbus? Look no further!"));
		Category category4 = categoryRepo.save(new Category("Event Parks", "These Columbus parks are great options to host an event or gathering. Many of these parks also host art and musical festivals throughout the year."));
		Category category5 = categoryRepo.save(new Category("Family-Friendly Parks", "These Columbus parks offer child-friendly ammenties like changing rooms, playsets and splash pads."));

		Comment comment1 = commentRepo.save(new Comment("I disagree with this review."));
		Comment comment2 = commentRepo.save(new Comment("This review is funny."));
		Comment comment3 = commentRepo.save(new Comment("I think this park is the best - I agree!"));
		Comment comment4 = commentRepo.save(new Comment("I agree with this review."));
		Comment comment5 = commentRepo.save(new Comment("This review is not funny."));
		Comment comment6 = commentRepo.save(new Comment("I think this park is so dirty!"));
		Comment comment7 = commentRepo.save(new Comment("This review is stupid."));


		Park park1 = parkRepo.save(new Park("Alum Creek Park", "", "", "", "", category1, category2));
		Park park2 = parkRepo.save(new Park("Wheeler Dog Park", "", "", "", "", category1));
		Park park3 = parkRepo.save(new Park("Scioto Audubon Metro Park", "", "", "", "", category3, category1, category5));
		Park park4 = parkRepo.save(new Park("Blendon Woods Metro Park", "", "", "", "", category4, category2));
		Park park5 = parkRepo.save(new Park("Highbanks Metro Park", "", "", "", "", category2, category1));
		Park park6 = parkRepo.save(new Park("Lower Olentangy Urban Arboretum", "", "", "", "", category1, category3));
		Park park7 = parkRepo.save(new Park("Goodale Park", "", "", "", "", category4));
		Park park8 = parkRepo.save(new Park("Schiller Park", "", "", "", "", category4, category5));
		Park park9 = parkRepo.save(new Park("Columbus Park of Roses", "", "", "", "", category4, category5));
		Park park10 = parkRepo.save(new Park("Franklin Park Conservatory & Botanical Gardens", "", "", "", "", category5, category4, category3));
		Park park11 = parkRepo.save(new Park("Fancyberg Park", "", "", "", "", category5));

		reviewRepo.save(new Review("Perfect Park", "park.com", "The park is great!", park1, comment1));
		reviewRepo.save(new Review("Happy Park", "park.com", "The park is fun!", park2, comment2));
		reviewRepo.save(new Review("Confusing Park", "park.com", "The park is not fun!", park3, comment3));
		reviewRepo.save(new Review("Excitement Park", "park.com", "The park is too much fun!", park4, comment4));
		reviewRepo.save(new Review("Boring Park", "park.com", "I do not like this park!", park5, comment5));
		reviewRepo.save(new Review("Perfect Park", "park.com", "The park is great!", park6, comment6));
		reviewRepo.save(new Review("Happy Park", "park.com", "The park is fun!", park7, comment7));
		reviewRepo.save(new Review("Confusing Park", "park.com", "The park is not fun!", park8));
		reviewRepo.save(new Review("Excitement Park", "park.com", "The park is too much fun!", park9));
		reviewRepo.save(new Review("Boring Park", "park.com", "I do not like this park!", park10));
		reviewRepo.save(new Review("Perfect Park", "park.com", "The park is great!", park11));
		reviewRepo.save(new Review("Happy Park", "park.com", "The park is fun!", park1));
		reviewRepo.save(new Review("Confusing Park", "park.com", "The park is not fun!", park2));
		reviewRepo.save(new Review("Excitement Park", "park.com", "The park is too much fun!", park3));
		reviewRepo.save(new Review("Boring Park", "park.com", "I do not like this park!", park4));
	}

}
