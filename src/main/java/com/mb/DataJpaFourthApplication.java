package com.mb;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mb.entity.ContactUsEntity;
import com.mb.repo.ContactUsRepo;

@SpringBootApplication
public class DataJpaFourthApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		= SpringApplication.run(DataJpaFourthApplication.class, args);
		
		UUID randomUUID = UUID.randomUUID();
		System.out.println(randomUUID);
		
		ContactUsRepo bean = context.getBean(ContactUsRepo.class);
		
		ContactUsEntity entity = new ContactUsEntity();
//		entity.setContactId(2);
		entity.setName("Rashmi Y");
		entity.setPhno("4242424242");
		entity.setEmail("ab@gmail.com");
		bean.save(entity);
	}

}
