package com.lingar.trying.draft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lingar.trying.main.beans.Products;

@Service
public class LingarService {
	@Autowired
	public LingarBean lb ;//= new LingarBean();
	public LingarService(){
		System.out.println("Lingar service here ");
		Products ps = new Products();
		
	}
}
