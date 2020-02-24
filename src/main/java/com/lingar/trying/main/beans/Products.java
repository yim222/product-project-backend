package com.lingar.trying.main.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
public class Products {
	@Autowired
	private List<Product> products= new ArrayList<Product>();
	public Products(){
////		products 
		Product p = new Product("Milk", true, 5);
		products.add(p);
		p = new Product("bread", true, 10);
		products.add(p);
		p = new Product("Lamp", false, 50);
		products.add(p);
		System.out.println("Products = \n" + products);
		
		



		
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public static void main(String[] args) {
		Products p = new Products();
		System.out.println("p ? " + p);
	}
}
