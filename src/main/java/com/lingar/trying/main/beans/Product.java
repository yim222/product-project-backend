package com.lingar.trying.main.beans;

import java.util.concurrent.atomic.AtomicLong;

public class Product {
//	public static int lastId ;
	
	private static AtomicLong counter = new AtomicLong();
	private long id = counter.incrementAndGet();
	private String name;
	private boolean available;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(){
		
	}
	public Product(String name, boolean available, int price) {
		super();
		this.name = name;
		this.available = available;
		this.price = price;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", available=" + available + ", price=" + price + "]";
	}
	
}
