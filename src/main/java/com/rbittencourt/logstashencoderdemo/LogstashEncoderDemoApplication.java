package com.rbittencourt.logstashencoderdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class LogstashEncoderDemoApplication {

	private Logger logger = LoggerFactory.getLogger(LogstashEncoderDemoApplication.class);

	@PostConstruct
	public void start() {
		logger.error("Error with message only");
		logger.error("Error with message and exception", new RuntimeException("An error occurs"));
	}

	public static void main(String[] args) {
		SpringApplication.run(LogstashEncoderDemoApplication.class, args);
	}

}
