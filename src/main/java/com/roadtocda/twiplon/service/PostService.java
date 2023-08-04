package com.roadtocda.twiplon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roadtocda.twiplon.model.Post;
import com.roadtocda.twiplon.model.Users;
import com.roadtocda.twiplon.repository.CommentsRepository;
import com.roadtocda.twiplon.repository.LikesRepository;
import com.roadtocda.twiplon.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postrepository;
	
	@Autowired
	private LikesRepository likesrepository;
	
	@Autowired
	private CommentsRepository commentsrepository;

	public Optional<Post> getPost(long id) {
		return postrepository.findById(id);
	}
	
	public Iterable<Post> getAllPosts(){
		return postrepository.findAll();
	}
}
