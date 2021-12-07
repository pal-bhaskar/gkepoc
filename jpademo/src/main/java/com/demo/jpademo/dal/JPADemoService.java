package com.demo.jpademo.dal;

import org.springframework.data.repository.CrudRepository;

import com.demo.jpademo.model.Customer;

public interface JPADemoService extends CrudRepository<Customer, String> {

}
