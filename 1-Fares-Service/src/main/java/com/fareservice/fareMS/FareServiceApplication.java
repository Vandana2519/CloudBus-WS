package com.fareservice.fareMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FareServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FareServiceApplication.class, args);
	}

}
