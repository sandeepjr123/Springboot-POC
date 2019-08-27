package org.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication

public class EurekaStudentappserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaStudentappserviceApplication.class, args);
	}
	
}
