package com.example.harboureats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestHarbourEatsApplication {

	public static void main(String[] args) {
		SpringApplication.from(HarbourEatsApplication::main).with(TestHarbourEatsApplication.class).run(args);
	}

}
