package com.example.weapon_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WeaponMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeaponMicroserviceApplication.class, args);
	}

}
