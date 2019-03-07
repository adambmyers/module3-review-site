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

		Category category1 = categoryRepo.save(new Category("Dog Parks", "We know how much dogs love to go to the park! These parks have off-the-leash areas where your furry friend can really enjoy themselves. You can help develop a dogs' positive behavior by letting them socialize, and perhaps you may even make a friend of your own.", "dog"));
		Category category2 = categoryRepo.save(new Category("Hiking Parks", "In a city surrounded by great parks, adventure is never far away. And we've made it even easier to find with our list of incredible Columbus hiking spots!", "hike"));
		Category category3 = categoryRepo.save(new Category("Bird Watching Parks", "Are you a bird lover looking for the best bird watching spots in Columbus? Look no further!", "bird"));
		Category category4 = categoryRepo.save(new Category("Event Parks", "These Columbus parks are great options to host an event or gathering. Many of these parks also host art and musical festivals throughout the year.", "event"));
		Category category5 = categoryRepo.save(new Category("Family-Friendly Parks", "These Columbus parks offer child-friendly ammenties like changing rooms, playsets and splash pads.", "kid"));


		Park park1 = parkRepo.save(new Park("Alum Creek Park", "Lewis Center", "parks.ohiodnr.gov/alumcreek", "Located in central Ohio, the 4,630-acre Alum Creek State Park provides access to the park’s 3,387-acre reservoir, a boater’s paradise. Sunseekers can mingle with one another on Ohio’s largest inland beach. Rolling hills and quiet coves nestled among shale cliffs offer a hub of recreational activity minutes from Ohio’s capital city. ", "alum-creek", category1, category2));
		Park park2 = parkRepo.save(new Park("Wheeler Dog Park", "Harrison West", "columbus.gov/recreationandparks/parks/Wheeler-Memorial-Park/", "The Wheeler dog park contains a side for small dogs and one for large dogs. Picnic tables, benches and a kiosk on-site. Park contains a drinking fountain.", "wheeler-dog", category1));
		Park park3 = parkRepo.save(new Park("Scioto Audubon Metro Park", "Downtown", "metroparks.net/parks-and-trails/scioto-audubon/", "Set amid a once industrial landscape, Scioto Audubon has been transformed from a blighted brownfield into a green oasis where wildlife and birds thrive and flourish. The 120-acre park is a recreational and educational destination for visitors of all ages. Located along the banks of the Scioto River just south of downtown Columbus, the park resulted from a partnership between Columbus, Ohio Audubon and Columbus Metro Parks to bring nature to the Capital City.", "scioto-audubon", category3, category1, category5));
		Park park4 = parkRepo.save(new Park("Blendon Woods Metro Park", "Westerville", "metroparks.net/parks-and-trails/blendon-woods/", "Blendon Woods contains spectacular stream-cut ravines with exposed ripple rock sandstone and open fields surrounded by beech-maple and oak-hickory forests. The 653-acre park is a great place to see a variety of songbirds, waterfowl and other wildlife, especially the flock of wild turkeys meandering about in search of food. The 118-acre Walden Waterfowl Refuge with its 11-acre Thoreau Lake provides a sanctuary for hundreds of birds, ducks and other wildlife. Open year-round, it features two elevated observation shelters with spotting scopes for viewing waterfowl.", "blendon-woods", category4, category2));
		Park park5 = parkRepo.save(new Park("Highbanks Metro Park", "Lewis Center", "metroparks.net/parks-and-trails/highbanks/", "Highbanks is named for its massive 100-foot-high shale bluff towering over the Olentangy State Scenic River. Tributary streams cutting across the bluff have created a number of deep ravines in the eastern part of the 1,200-acre park. Ohio and Olentangy shales, often containing outstanding large concretions, are exposed on the bluff face and sides of the ravines.", "highbanks", category2, category1));
		Park park6 = parkRepo.save(new Park("Lower Olentangy Urban Arboretum", "Clintonville", "lowerolentangyurbanarboretum.org", "", "lower-olentangy", category1, category3));
		Park park7 = parkRepo.save(new Park("Goodale Park", "Victorian Village", "columbus.gov/recreationandparks/parks/Goodale-Park/", "Goodale Park is surrounded by Victorian Village, a cluster of homes with charming architectural features. It is the oldest park in Columbus and among the oldest in the United States. Although Goodale Park contains an expansive playground and tennis courts, the park's main attraction is its view of the Columbus skyline and the serenity offered alongside a scenic pond and the charm of the gazebo and of its historic park shelter. A walk through Goodale Park is a refreshing experience.", "goodale-park", category4));
		Park park8 = parkRepo.save(new Park("Schiller Park", "German Village", "columbus.gov/recreationandparks/parks/schiller-park/", "Schiller Park is the second oldest park in the City of Columbus, runner up to only Goodale Park, established in 1857. Schiller Park was obtained in April 1867. It was named Schiller park after the famous German poet, Friedrich von Schiller. An impressive statue of Schiller decorates the center of the park.", "schiller", category4, category5));
		Park park9 = parkRepo.save(new Park("Columbus Park of Roses", "Clintonville", "parkofroses.org", "Columbus Park of Roses is a unique public garden in Columbus, Ohio. It was created in 1953 and has grown to include over 12,000 roses of more than 400 varieties. There are also herb and perennial gardens and display beds of annual plantings.", "park-of-roses", category4, category5));
		Park park10 = parkRepo.save(new Park("Franklin Park Conservatory & Botanical Gardens", "Franklin Park", "fpconservatory.org", "Franklin Park Conservatory and Botanical Gardens is Central Ohio’s premier botanical garden and home to the iconic John F. Wolfe Palm House which dates back to 1895. Situated just east of Franklin Park, the Conservatory is approximately two miles from downtown Columbus. The visitor experience spans about 13-acres and is comprised of the Conservatory building, The Scotts Miracle-Gro Foundation Children’s Garden and the Grand Mallway. The experience consists of botanical biomes, lush gardens, special horticulture and art exhibitions, and seasonal offerings. A collection of glass works by artist Dale Chihuly is also on display and included with admission.", "franklin-park", category5, category4, category3));
		Park park11 = parkRepo.save(new Park("Fancyburg Park", "Upper Arlington", "upperarlingtonoh.gov/city-parks/fancyburg-park/", "The annual Fall Festival is held in this park along with several Community Athletics events. There is also a playground and many other amenities.", "fancyberg", category5));

		Review review1 = reviewRepo.save(new Review("Perfect Park", "park.com", "The park is great!", park1));
		Review review2 =reviewRepo.save(new Review("Happy Park", "park.com", "The park is fun!", park2));
		Review review3 =reviewRepo.save(new Review("Confusing Park", "park.com", "The park is not fun!", park3));
		Review review4 =reviewRepo.save(new Review("Excitement Park", "park.com", "The park is too much fun!", park4));
		Review review5 =reviewRepo.save(new Review("Boring Park", "park.com", "I do not like this park!", park5));
		Review review6 =reviewRepo.save(new Review("Perfect Park", "park.com", "The park is great!", park6));
		Review review7 =reviewRepo.save(new Review("Happy Park", "park.com", "The park is fun!", park7));
		Review review8 =reviewRepo.save(new Review("Confusing Park", "park.com", "The park is not fun!", park8));
		Review review9 =reviewRepo.save(new Review("Excitement Park", "park.com", "The park is too much fun!", park9));
		Review review10 =reviewRepo.save(new Review("Boring Park", "park.com", "I do not like this park!", park10));
		Review review11 =reviewRepo.save(new Review("Perfect Park", "park.com", "The park is great!", park11));
		Review review12 =reviewRepo.save(new Review("Happy Park", "park.com", "The park is fun!", park1));
		Review review13 =reviewRepo.save(new Review("Confusing Park", "park.com", "The park is not fun!", park2));
		Review review14 =reviewRepo.save(new Review("Excitement Park", "park.com", "The park is too much fun!", park3));
		Review review15 =reviewRepo.save(new Review("Boring Park", "park.com", "I do not like this park!", park4));
		
		Comment comment1 = commentRepo.save(new Comment("I disagree with this review.", review1));
		Comment comment2 = commentRepo.save(new Comment("This review is funny.", review2));
		Comment comment3 = commentRepo.save(new Comment("I think this park is the best - I agree!", review2));
		Comment comment4 = commentRepo.save(new Comment("I agree with this review.", review3));
		Comment comment5 = commentRepo.save(new Comment("This review is not funny.", review4));
		Comment comment6 = commentRepo.save(new Comment("I think this park is so dirty!", review5));
		Comment comment7 = commentRepo.save(new Comment("This review is stupid.", review6));
		
	}

}