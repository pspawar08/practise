package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerRepo;
import com.model.customer;

@Service
public class custDao {

	@Autowired
	CustomerRepo cr;


	public void savinfo(customer cc) {

			cr.save(cc);
			
	}
	
	
}
