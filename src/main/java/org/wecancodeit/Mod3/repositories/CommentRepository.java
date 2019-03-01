package org.wecancodeit.Mod3.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.Mod3.models.Comment;

@Repository
public interface CommentRepository extends CrudRepository <Comment, Long>{

}
