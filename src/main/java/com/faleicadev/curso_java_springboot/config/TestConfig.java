package com.faleicadev.curso_java_springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.faleicadev.curso_java_springboot.entities.Order;
import com.faleicadev.curso_java_springboot.entities.User;
import com.faleicadev.curso_java_springboot.entities.enums.OrderStatus;
import com.faleicadev.curso_java_springboot.repositories.OrderRepository;
import com.faleicadev.curso_java_springboot.repositories.UserRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;	

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "Jhon", "jhon@gmail.com", "999995566", "123456");
		User u4 = new User(null, "Anne", "anne@gmail.com", "988995585", "123456");
		
		Order o1 = new Order(null, Instant.parse("2022-12-23T21:22:00Z"), OrderStatus.DELIVERY, u1);
		Order o2 = new Order(null, Instant.parse("2022-12-23T21:22:00Z"), OrderStatus.DELIVERY, u2);
		Order o3 = new Order(null, Instant.parse("2022-12-23T21:22:00Z"), OrderStatus.SHIPPED, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
	
}
