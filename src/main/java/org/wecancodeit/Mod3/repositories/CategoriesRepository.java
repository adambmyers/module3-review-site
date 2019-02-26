package org.wecancodeit.Mod3.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.Mod3.models.Category;
import org.wecancodeit.Mod3.models.Park;

@Repository
//just note this is an interface
/*  CrudRepo is an interface part of the spring framework that allows us to 
create, read, update, and delete objects in the repository
Note that CrudRepo has items listed as value, key  */
public interface CategoriesRepository extends CrudRepository<Category,Long> {

	Category findByName(String categoryName);

	Optional<Category> findById(Long id);
	
	
}
