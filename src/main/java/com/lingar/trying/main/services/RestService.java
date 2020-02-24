package com.lingar.trying.main.services;

import java.util.TreeMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lingar.trying.main.beans.Product;
import com.lingar.trying.main.beans.Products;
import com.lingar.trying.main.dao.ProductsDao;
@CrossOrigin
@RestController
public class RestService {
	ProductsDao pDao = new ProductsDao();
	public RestService(){
		System.out.println("Lingar rest service here ");
	}
	@GetMapping("/test")
	public String testWS(){
		return "test WS work";
	}
	
	@GetMapping("/getProductsMap")
	public TreeMap<Long , Product >  getProductsMap(){
		System.out.println("Getting all products - " + pDao.getAllproducts());
		return pDao.getAllproducts();
	}
	
	
	@GetMapping("/getProducts")
	public Products  getProducts(){
		System.out.println("Getting all products - " + pDao.getAllproducts());
		return pDao.getProducts();
	}
	
	
	@GetMapping("/getProducts/{id}")
	public Product getProductById(@PathVariable ("id")long myId){
		return pDao.getAllproducts().get(myId);
	}
	@RequestMapping(value = "/createProduct", method = RequestMethod.POST)
	public boolean createProduct(@RequestBody Product product){
		System.out.println("saving product : " + product);		
		
		return pDao.saveProduct(product);
	}
	

}
