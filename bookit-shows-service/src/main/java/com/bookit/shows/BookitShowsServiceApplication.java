package com.bookit.shows;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookitShowsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookitShowsServiceApplication.class, args);
	}

}
