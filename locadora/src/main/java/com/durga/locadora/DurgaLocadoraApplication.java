package com.durga.locadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "com.durga.locadora")
@SpringBootApplication
@EnableAutoConfiguration
public class DurgaLocadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(DurgaLocadoraApplication.class, args);
	}

}
