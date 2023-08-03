package com.roadtocda.twiplon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.twiplon.model.Users;
import com.roadtocda.twiplon.repository.CommentsRepository;
import com.roadtocda.twiplon.repository.LikesRepository;
import com.roadtocda.twiplon.repository.PostRepository;
import com.roadtocda.twiplon.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersrepository;
	
	@Autowired
	private PostRepository postrepository;
	
	@Autowired
	private LikesRepository likesrepository;
	
	@Autowired
	private CommentsRepository commentsrepository;
	
	public Optional<Users> getUser(long id) {
		return usersrepository.findById(id);
	}
	
	public Iterable<Users> getAllUsers(){
		return usersrepository.findAll();
	}
}
