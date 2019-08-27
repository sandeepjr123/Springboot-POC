package org.Student.Controller;

import java.util.List;

import org.Student.Model.Topic;
import org.Student.Service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Resourcecontroller {
	
	
@Autowired
	Studentservice studentservice;
	
	@RequestMapping("/Topics")
	
	//Get call
	
	public List<Topic> GetallTopics() {
		
		return studentservice.GetallTopics();

	}
	

}
