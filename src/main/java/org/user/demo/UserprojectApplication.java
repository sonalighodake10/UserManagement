package org.user.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(basePackages="org.user.demo.controller,"+"org.user.demo.dao,"+"org.user.demo.service")
public class UserprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserprojectApplication.class, args);
		
	}

}
