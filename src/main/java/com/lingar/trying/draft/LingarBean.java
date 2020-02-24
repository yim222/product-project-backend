package com.lingar.trying.draft;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class LingarBean {
	public String x = "lingar x";
	public String y = "lingar y";
	public LingarBean(){
		System.out.println("Hi Lingar bean");
	}
	
	

}
