package com.farmhand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfig("dev")
@EnableEureka
@EnableZuul
public class TwitterConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterConnectorApplication.class, args);
	}
}
