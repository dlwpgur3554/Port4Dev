package com.port4dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Sh4TeamMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sh4TeamMainApplication.class, args);
	}

}
