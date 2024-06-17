package com.gabrieldev.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrieldev.workshopmongo.domain.User;
import com.gabrieldev.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService service;
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		//User maria = new User("1", "Maria Silva", "@maria@gmail.com");
		//User alex = new User("2", "Alex Brown", "@alex@gmail.com");
		//List<User> list = new ArrayList<>();
		//list.addAll(Arrays.asList(maria, alex));
		//return ResponseEntity.ok().body(list);
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
