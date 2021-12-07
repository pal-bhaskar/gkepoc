package com.demo.jpademo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpademo.dal.JPADemoService;
import com.demo.jpademo.model.Customer;

@RestController
@RequestMapping("/private/v1/jpatest")
public class JPAController {
	
	@Autowired
	private JPADemoService jpaDemoService;

	
	@GetMapping("/get/allcustomer")
	public List<Customer> getAllCustomer() {
		List<Customer> customerList = new ArrayList<>();
		jpaDemoService.findAll().forEach(customerList :: add);
		return customerList;
	}
	
	@PostMapping("/add/customer")
	public void addContent(@RequestBody Customer customer) {
		jpaDemoService.save(customer);
	}
	
}
