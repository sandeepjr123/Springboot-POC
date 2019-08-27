package org.Student.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.Student.Model.*;
import org.springframework.stereotype.Service;

@Service
public class Studentservice {

	List<Topic> topics  =new ArrayList<>(Arrays.asList(
			new Topic ("mpmc","mathsphy","Science"),
			new Topic ("EGC","ELE","matScience"),
			new Topic ("PGC","phy","PHYScience"),
			new Topic ("MAGC","MAG","MAGScience")
			));
	
public  List<Topic> GetallTopics() {
		
		return topics;

}

}
