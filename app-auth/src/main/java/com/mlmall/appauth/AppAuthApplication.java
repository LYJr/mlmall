package com.mlmall.appauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.mlmall.appauth"})
@EnableJpaRepositories(basePackages = {"com.mlmall.appauth"})
@SpringBootApplication
public class AppAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppAuthApplication.class, args);
	}

}
