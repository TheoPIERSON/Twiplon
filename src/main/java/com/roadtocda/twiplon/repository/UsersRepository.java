package com.roadtocda.twiplon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roadtocda.twiplon.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long>{

}
