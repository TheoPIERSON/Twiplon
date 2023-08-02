package com.roadtocda.twiplon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roadtocda.twiplon.model.Likes;

@Repository
public interface LikesRepository extends CrudRepository<Likes, Long>{

}
