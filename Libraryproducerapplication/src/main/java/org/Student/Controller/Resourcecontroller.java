package org.Student.Controller;








import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.Student.Model.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.utils.FallbackMethod;






@RestController

public class Resourcecontroller {
	
	@Autowired
    private RestTemplate restTemplate;
	
	
	
	
	@RequestMapping("/Gettopics")
	
	
	
	@HystrixCommand(fallbackMethod = "callStudentServiceAndGetData_Fallback")	
public List<Topic> GetallTopics() {
		
		List<Topic> topic  = (List<Topic>) restTemplate.getForObject("http://localhost:8098/Topics", List.class);
	
	

	  return topic;

	}
	
	
	@RequestMapping("/Fallback")
	public List<Topic> Fallback() {
	
		List<Topic> topics  =new ArrayList<>(Arrays.asList(
				new Topic ("mpmc","mathsphy","Science"),
				new Topic ("EGC","ELE","matScience")
				
				));
		
		
		return topics;
	}
	
	
	private List<Topic> callStudentServiceAndGetData_Fallback() {
		
		List<Topic> topic  = (List<Topic>) restTemplate.getForObject("http://localhost:8003/Fallback", List.class);
		
		System.out.println("Fallback method invoked and primary details returned");

		  return topic;
		
	}

	
	
	
		
	}

			
	
	

	


