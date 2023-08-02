package com.roadtocda.twiplon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roadtocda.twiplon.model.Comment;

@Repository
public interface CommentsRepository extends CrudRepository<Comment, Long>{

}
