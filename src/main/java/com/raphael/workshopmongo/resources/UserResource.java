package com.raphael.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raphael.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User sherlock = new User("1","Raphael", "raphael@gmail.com");
		User raphael = new User("2", "Sherlock", "sherlock@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(sherlock, raphael));
		return ResponseEntity.ok().body(list);
	}
}
