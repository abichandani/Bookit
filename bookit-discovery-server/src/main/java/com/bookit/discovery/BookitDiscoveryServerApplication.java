package com.bookit.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookitDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookitDiscoveryServerApplication.class, args);
	}

}
