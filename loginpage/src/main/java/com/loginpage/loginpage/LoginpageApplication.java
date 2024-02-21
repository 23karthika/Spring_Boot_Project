package com.loginpage.loginpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class LoginpageApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginpageApplication.class, args);
	}

}
