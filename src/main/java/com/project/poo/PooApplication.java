package com.project.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {

		SpringApplication.run(PooApplication.class, args);
	}

}
