package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.examples.account.repository.AccountRepository;
import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferService;
import com.examples.account.service.TransferServiceImpl;


@Configuration
@ComponentScan("com")

//we can also import xml suppose we have legacy code 200 classs now we cannot convert to annotations 
//every cllass so we simply import that xml file -->Reason
//@ImportResource(value=" ")
public class AppContext {

	@Bean
	public InMemoryAccountRepository accountRepository() {
		return new InMemoryAccountRepository() ;
	}
	@Bean
	public TransferServiceImpl transferService() {
		return new TransferServiceImpl(accountRepository());
	}
	
	
}
