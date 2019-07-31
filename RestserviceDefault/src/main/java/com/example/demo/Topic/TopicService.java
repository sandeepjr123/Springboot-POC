package com.example.demo.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	List<Topic> topics  =new ArrayList<>(Arrays.asList(
			new Topic ("mpmc","mathsphy","Science"),
			new Topic ("EGC","ELE","matScience"),
			new Topic ("PGC","phy","PHYScience"),
			new Topic ("MAGC","MAG","MAGScience")
			));
	
public List<Topic> GetallTopics() {
		
		return topics;

}

//Get method by Individual name 

public Topic GetTopicName(String name) {
	
	return topics.stream().filter (t-> t.getName().equals(name)).findFirst().get();
	
	
}

//Post method

public void Addtopic(Topic topic) {
	
	
	topics.add( topic);
}


//PUT METHOD

public void Updatetopic(String name ,Topic topic) {
	
	for (int i=0;i<topics.size();i++) {
		
		Topic t =topics.get(i);
		if (t.getName().equals(name)){
			topics.set(i, topic);
			return;
		}
	}
	
}


//Delete CALL
public void Deletetopic(String name) {
	topics.removeIf(t-> t.getName().equals(name));
	
}
}


