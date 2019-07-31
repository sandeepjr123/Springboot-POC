package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.Mqsender;




@RestController
@RequestMapping(value = "/Sandeep")
public class WebController {
	
	@Autowired
	Mqsender mqsender;
	
	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId) {
		
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		mqsender.send(emp);

			return "Message sent to the RabbitMQ sandeep Successfully";
		}

	
	
	
	
	
	

}
