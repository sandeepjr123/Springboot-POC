package com.RabbitMq.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RabbitMq.Model.Student;
import com.RabbitMq.Service.Mqsender;


@RestController

public class ResourceController {
	
	@Autowired
	Mqsender mqsender;
	
	
	@PostMapping ("/AddClassinfo")
	public String AddDetails( @RequestBody Student Classinfo) {
	
		mqsender.send(Classinfo);
		
		return "Message sent to rabbitMQ succesfully";
		
	}

}
