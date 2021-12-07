package com.demo.presentation.svc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.presentation.svc.clients.JPADemoClient;
import com.demo.presentation.svc.model.Customer;

@Service
public class PresentationService {
	
	@Autowired
	private JPADemoClient jpaDemoClient;

	public List<Customer> findAllCustomer() {	
		return jpaDemoClient.getCustomers();
	}

	public void save(Customer customer) {
		jpaDemoClient.saveCustomer(customer);
	}

	
}
