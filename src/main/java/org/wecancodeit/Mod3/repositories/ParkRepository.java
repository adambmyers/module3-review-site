package org.wecancodeit.Mod3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.Mod3.models.Park;

@Repository
public interface ParkRepository extends CrudRepository <Park, Long>{

	Park findByParkName(String parkName);

	Object findAllById(Long id);

	
}

