package com.Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaProducerserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerserverApplication.class, args);
	}

}
