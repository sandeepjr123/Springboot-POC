package com.example.demo.Service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import com.example.demo.Model.Employee;
import com.example.demo.Repository.ServiceRepository;


@Service
public class Mqsender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	@Value("${sandeep.rabbitmq.exchange}")
	String exchange;

	@Value("${sandeep.rabbitmq.routingkey}")
	private String routingkey;

	

	public void send(Employee company ) {
		amqpTemplate.convertAndSend(exchange, routingkey,company);
		System.out.println("Send msg = " + company);
		
	}
	
	
	///Newly added
	
	@RabbitListener(queues = "sandeep.queue")
	public void recievedMessage(Employee employeeinfo) {
		System.out.println("Recieved Message From RabbitMQ: " + employeeinfo);
		
		//Loading details in to Database
		servicerepository.save(employeeinfo);
	}
	
	@Autowired
	public ServiceRepository servicerepository;
	
	
	
	
}
