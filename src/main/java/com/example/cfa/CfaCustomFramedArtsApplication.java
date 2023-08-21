package com.example.cfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.example.cfa.controller","com.example.cfa.service"})
@EntityScan("com.example.cfa.model")
@EnableJpaRepositories("com.example.cfa.repository")
@SpringBootApplication
public class CfaCustomFramedArtsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfaCustomFramedArtsApplication.class, args);
	}

}
