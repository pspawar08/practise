package com.example;

import org.springframework.data.repository.CrudRepository;

import com.model.customer;
public interface CustomerRepo extends CrudRepository<customer, Integer> {

	
	
}
