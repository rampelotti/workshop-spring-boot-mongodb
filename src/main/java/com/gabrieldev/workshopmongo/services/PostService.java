package com.gabrieldev.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrieldev.workshopmongo.domain.Post;
import com.gabrieldev.workshopmongo.repository.PostRepository;
import com.gabrieldev.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) { 
		 Optional<Post> obj = repo.findById(id); 
		 return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); 
		} 
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContaining(text);
	}
}
