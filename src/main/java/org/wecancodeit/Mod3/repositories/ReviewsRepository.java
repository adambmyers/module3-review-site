package org.wecancodeit.Mod3.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.Mod3.models.Review;

@Repository
public interface ReviewsRepository extends CrudRepository<Review,Long> {
	
	}

