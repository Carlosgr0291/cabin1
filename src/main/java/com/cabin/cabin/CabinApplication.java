package com.cabin.cabin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"co.usa.ciclo3.ciclo3.model"})
@SpringBootApplication
public class CabinApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabinApplication.class, args);
	}

}
