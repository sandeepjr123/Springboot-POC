package com.example.demo.Topic;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Topiccontroller {
	@Autowired
	private TopicService topicservice;
	
	
	
//Get Method	
	@RequestMapping("/Topics")
	
	
	
	public List<Topic> GetallTopics() {
		
		return topicservice.GetallTopics();

	}
	
	
	//Post method 
	@RequestMapping(method=RequestMethod.POST,value ="/Topics" )
	public void Addtopic( @RequestBody Topic topic) {
		
		 topicservice.Addtopic(topic);
		
	}
	
	//Update method 
	@RequestMapping(method=RequestMethod.PUT,value ="/Topics/{name}" )
	
	public void Updatetopic(@RequestBody Topic topic , @PathVariable String name ) {
		
		 
		topicservice.Updatetopic( name ,topic);
		
	}
	
	//Delete method
	
	@RequestMapping(method=RequestMethod.DELETE,value ="/Topics/{name}" )
	
	public void Deletetopic( @PathVariable String name ) {
		
		topicservice.Deletetopic(name);
		
		
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	


