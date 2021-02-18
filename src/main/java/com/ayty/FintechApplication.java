package com.ayty;

import com.ayty.model.Company;
import com.ayty.model.Consumer;
import com.ayty.repository.CompanyRepository;
import com.ayty.repository.ConsumerRepository;
import com.ayty.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FintechApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext configurableApplicationContext =
				 SpringApplication.run(FintechApplication.class, args);
		UserRepository consumerRepository = configurableApplicationContext.getBean(ConsumerRepository.class);
		UserRepository companyRepository = configurableApplicationContext.getBean(CompanyRepository.class);

		Consumer myConsumer = new Consumer("bei", "gabriel bento", "99999", "gabriel@gmail.com", "12345");
		Company myCompany = new Company("bei", "gabriel bento", "99999", "gabriel@gmail.com", "12345", "bento", "bentoco", "i1i1i21i");
		consumerRepository.save(myConsumer);
		companyRepository.save(myCompany);
	}

}
