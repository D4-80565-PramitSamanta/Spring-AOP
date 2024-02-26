package com.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aop.dao.AccountDAO;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO dao)
	{
		return runner->{
			System.out.println("running");
			demoBeforeAdvice(dao);
		};
	}
	private void demoBeforeAdvice(AccountDAO dao) {
		// other business logic
		dao.addAccount();
	}
	
}
