package com.demo.presentation.svc.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.presentation.svc.model.Customer;

@FeignClient(value="jpademo")
public interface JPADemoClient {

	@GetMapping(value = "/private/v1/get/allcustomer", produces = "application/json")
    List<Customer> getCustomers();

    @PostMapping(value = "/private/v1/add/customer")
    void saveCustomer(Customer customerData);
}
