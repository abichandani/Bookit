package com.bookit.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookitUsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookitUsersServiceApplication.class, args);
	}

}
