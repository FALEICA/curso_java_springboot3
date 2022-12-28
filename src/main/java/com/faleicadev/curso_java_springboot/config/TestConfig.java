package com.faleicadev.curso_java_springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.faleicadev.curso_java_springboot.entities.Category;
import com.faleicadev.curso_java_springboot.entities.Order;
import com.faleicadev.curso_java_springboot.entities.Product;
import com.faleicadev.curso_java_springboot.entities.User;
import com.faleicadev.curso_java_springboot.entities.enums.OrderStatus;
import com.faleicadev.curso_java_springboot.repositories.CategoryRepository;
import com.faleicadev.curso_java_springboot.repositories.OrderRepository;
import com.faleicadev.curso_java_springboot.repositories.ProductRepository;
import com.faleicadev.curso_java_springboot.repositories.UserRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
		
		Product prd1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product prd2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product prd3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product prd4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product prd5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		productRepository.saveAll(Arrays.asList(prd1, prd2, prd3, prd4, prd5));
		
		
		Category cat1 = new Category(null, "Elctronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		
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
