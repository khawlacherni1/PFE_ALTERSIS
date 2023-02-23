package com.khawla.pfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Pfe2Application {

	public static void main(String[] args) {
		SpringApplication.run(Pfe2Application.class, args);
		System.out.println("hello from the other side!");
	}

}
