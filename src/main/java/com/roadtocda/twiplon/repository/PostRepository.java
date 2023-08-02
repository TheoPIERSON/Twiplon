package com.roadtocda.twiplon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roadtocda.twiplon.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>{

}
