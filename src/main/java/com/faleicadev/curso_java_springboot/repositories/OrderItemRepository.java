package com.faleicadev.curso_java_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.faleicadev.curso_java_springboot.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
