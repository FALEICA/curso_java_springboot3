package com.faleicadev.curso_java_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faleicadev.curso_java_springboot.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
