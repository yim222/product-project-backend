package com.lingar.trying.main.dao;

import java.util.List;
import java.util.TreeMap;

import com.lingar.trying.main.beans.Product;
import com.lingar.trying.main.beans.Products;

public class ProductsDao {
	private Products products;
	private TreeMap<Long , Product > currentProductsMap = new TreeMap<Long , Product>();
	
	/**
	 * Like get all for avoid miss understood and forgetting
	 * @return
	 */
	public TreeMap<Long, Product> getAllproducts() {
		return currentProductsMap;
	}
	
	/**
	 * Saving product
	 * @return
	 */
	public boolean saveProduct(Product p){
		
		try {
			products.getProducts().add(p);
			currentProductsMap.put(p.getId(), p);
		} catch (Exception e) {
			System.out.println("Product didn't created. Error : \n" + e.getMessage());
			return false;
		}	
		
		return true;
	}
	
	public TreeMap<Long, Product> getCurrentProductsMap() {
		return currentProductsMap;
	}
	public void setCurrentProductsMap(TreeMap<Long, Product> currentProductsMap) {
		this.currentProductsMap = currentProductsMap;
	}
	
	
	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public ProductsDao(){
		products = new Products();
		for(Product p : products.getProducts()){
			currentProductsMap.put(p.getId(), p);
		}
	}
	

}
