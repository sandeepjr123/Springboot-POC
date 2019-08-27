package com.RabbitMq.Service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.RabbitMq.Model.Student;


@Service
public class Mqsender {
	
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	@Value("ClassInfo.exchange")
	String exchange;

	@Value("ClassInfo.routingkey")
	private String routingkey;
	
	
	public void send(Student Classinfo ) {
		amqpTemplate.convertAndSend(exchange, routingkey,Classinfo);
		
		
	}
	
	

}
