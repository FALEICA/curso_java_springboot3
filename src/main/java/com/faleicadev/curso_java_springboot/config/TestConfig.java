package com.faleicadev.curso_java_springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.faleicadev.curso_java_springboot.entities.User;
import com.faleicadev.curso_java_springboot.repositories.UserRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "Jhon", "jhon@gmail.com", "999995566", "123456");
		User u4 = new User(null, "Anne", "anne@gmail.com", "988995585", "123456");
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
	}
	
	
	
}
