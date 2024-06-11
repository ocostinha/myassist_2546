package com.fiap.myassist_2546;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fiap.myassist_2546.resources.repository"})
public class Myassist2546Application {

	public static void main(String[] args) {
		SpringApplication.run(Myassist2546Application.class, args);
	}

}
