package com.example.demo.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	
	//DECLARES PRIMARY KEY
	@Id
	private String name;
	private String ID;
	private String Description;
	
	public Topic()
	{
		
	}
	
public Topic(String name, String iD, String description) {
		super();
		this.name = name;
		this.ID = iD;
		this.Description = description;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	
	
	
	
}
