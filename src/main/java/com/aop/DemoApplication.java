package com.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aop.dao.AccountDAO;
import com.aop.dao.MembershipDAO;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO dao, MembershipDAO mao)
	{
		return runner->{
			System.out.println("running");
			demoBeforeAdvice(dao,mao);
		};
	}
	private void demoBeforeAdvice(AccountDAO dao, MembershipDAO mao) {
		// other business logic
		dao.addAccount();
		dao.addImp();
		mao.addAccount();
	}
	
}
