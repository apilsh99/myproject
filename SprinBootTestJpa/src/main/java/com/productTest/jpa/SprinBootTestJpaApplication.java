package com.productTest.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.productTest.entity")
@EnableJpaRepositories("com.productTest.repository")
@ComponentScan("com.productTest")
public class SprinBootTestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinBootTestJpaApplication.class, args);
	}

}
