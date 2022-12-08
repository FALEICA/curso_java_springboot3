package com.faleicadev.curso_java_springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faleicadev.curso_java_springboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Fabio", "fab@gmmail.com", "988998899", "1234");
		return ResponseEntity.ok().body(u);
		
		
	}
	

}
