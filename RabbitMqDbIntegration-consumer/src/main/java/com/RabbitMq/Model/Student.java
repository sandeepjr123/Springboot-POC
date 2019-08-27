package com.RabbitMq.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="classinfo" )
public class Student {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Gen_Id")
	private int GenericId;
	
@Column(name = "Standard")
private String Standard;

@Column(name = "Medium")
private  String Medium;

@Column(name = "StudentCount")
private int StudentCount;




public String getStandard() {
	return Standard;
}

public void setStandard(String standard) {
	Standard = standard;
}
public String getMedium() {
	return Medium;
}
public void setMedium(String medium) {
	Medium = medium;
}
public int getStudentCount() {
	return StudentCount;
}
public void setStudentCount(int studentCount) {
	StudentCount = studentCount;
}




}
