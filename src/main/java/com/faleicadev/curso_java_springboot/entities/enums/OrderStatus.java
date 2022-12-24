package com.faleicadev.curso_java_springboot.entities.enums;

public enum OrderStatus {
	WHAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERY(4),
	CANCELD(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code; 
	}
	
	public int getCode() {
		return code;
	}
	
	
	public static OrderStatus valueOf(int code)  {
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode() == code){
			 	return value;
			}
			
		}
		throw new IllegalArgumentException("Invalid OrderStatus Code");
		
		
	}
}
