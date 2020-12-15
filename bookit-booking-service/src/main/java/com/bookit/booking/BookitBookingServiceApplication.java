package com.bookit.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookitBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookitBookingServiceApplication.class, args);
	}

}
