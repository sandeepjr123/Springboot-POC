package org.Student.Controller;







import java.util.List;

import org.Student.Model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;






@RestController

public class Resourcecontroller {
	
	@Autowired
    private RestTemplate restTemplate;
	
	//Get call
	
	@RequestMapping("/Gettopics")
	
	public List<Topic> GetallTopics() {
	
		List<Topic> topic  = (List<Topic>) restTemplate.getForObject("http://Eurekastudentappservice/Topics", List.class);
	
	

	  return topic;

	}
}
	


