package com.demo.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JpademoApplication {

	@Autowired
	DiscoveryClient discoveryClient;
	
	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

}
