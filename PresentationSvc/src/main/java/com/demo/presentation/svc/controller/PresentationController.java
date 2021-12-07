package com.demo.presentation.svc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.presentation.svc.model.Customer;
import com.demo.presentation.svc.service.PresentationService;

@RestController
@RequestMapping("/public/v1")
public class PresentationController {
	
	@Autowired
	private PresentationService presentationService;
	

	@GetMapping("/apitest/{name}")
	public String getTest(@PathVariable String name) {
		
		return "Hello ".concat(name);
	}
	
	@GetMapping("/get/allcustomer")
	public List<Customer> getAllCustomer() {
		return presentationService.findAllCustomer();
	}
	
	@PostMapping("/add/customer")
	public void addContent(@RequestBody Customer customer) {
		presentationService.save(customer);
	}
}
