package com.bookit.theatres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookitTheatresServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookitTheatresServiceApplication.class, args);
	}

}
