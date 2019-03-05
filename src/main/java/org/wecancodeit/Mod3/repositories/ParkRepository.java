package org.wecancodeit.Mod3.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.Mod3.models.Park;

@Repository
public interface ParkRepository extends CrudRepository <Park, Long>{

//	Park findByParkName(String parkName);

	Optional<Park> findById(Long categoryId);

	Object findAllById(Long categoryId);
	
}

