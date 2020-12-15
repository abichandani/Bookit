package com.bookit.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
//@EnableOAuth2Sso
public class BookitZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookitZuulServerApplication.class, args);
	}

}
