package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.lti"})
//@EnableJpaRepositories("com.lti.db")
public class ImageUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageUploadApplication.class, args);
	}

}