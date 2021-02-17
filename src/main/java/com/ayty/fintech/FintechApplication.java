package com.ayty.fintech;

import com.ayty.model.Company;
import com.ayty.model.Consumer;
import com.ayty.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class FintechApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FintechApplication.class, args);
		User a = new Consumer(1234, "bei", "gabriel bento", "999999", "gabriel@bento.com", "SKADJAHEURTAT");
		User b = new Company(1234, "bei", "gabriel bento", "999999", "gabriel@bento.com", "SKADJAHEURTAT", "bentoco", "bento co.", "919191919");
		System.out.println(a.toString());
		System.out.println(b.getEmail());
	}

}
