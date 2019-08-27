package com.RabbitMq.Service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.RabbitMq.Model.Student;
import com.RabbitMq.Repository.StudentRepository;



@Service
public class RabbitMqreciever {
	
	@Autowired
	public StudentRepository studentrepository;
	
	
	@Bean
	public Jackson2JsonMessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	
	@Value("ClassInfo.exchange")
	String exchange;

	@Value("ClassInfo.routingkey")
	private String routingkey;
	
	@RabbitListener(queues = "ClassInfo.queue")
	public void recievedMessage(Student Classinfo) {
		System.out.println("Recieved Message From RabbitMQ");
		
		//Loading details in to Database
		studentrepository.save(Classinfo);
	}
	

}
