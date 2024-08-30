package com.example.armor_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ArmorMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArmorMicroserviceApplication.class, args);
	}

}
