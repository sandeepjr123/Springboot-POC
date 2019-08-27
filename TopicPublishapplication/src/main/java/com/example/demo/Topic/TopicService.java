package com.example.demo.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.asm.Advice.Argument;


@Service
public class TopicService {
	
	
	
	@Autowired
	private TopicRepository topicRepository ;
	
	
	//Get method 
	
public List<Topic> GetallTopics() {
	List<Topic> topics  =new ArrayList<> ();
		topicRepository.findAll()
		.forEach (topics :: add);
		return topics;

}

//Post method

public void Addtopic(Topic topic) {
	
	
	topicRepository.save(topic);
}


//PUT METHOD

public void Updatetopic(Topic topic) {
	
	topicRepository.save(topic);
}


//Delete CALL
public void Deletetopic(String name) {
	topicRepository.deleteById(name);
	
}
}


