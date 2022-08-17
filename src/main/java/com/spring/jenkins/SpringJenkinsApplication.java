package com.spring.jenkins;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@PostConstruct
	public void intt() {
		logger.info("Application starte....!!");

	}
	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(SpringJenkinsApplication.class, args);

	}

}
