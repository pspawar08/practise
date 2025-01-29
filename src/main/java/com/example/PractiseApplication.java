package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dao.custDao;
import com.model.customer;


@SpringBootApplication
@EntityScan(basePackages = "com.model")
@EnableJpaRepositories(basePackages = "com.example")
public class PractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PractiseApplication.class, args);
		
		
		
	}
	

}
