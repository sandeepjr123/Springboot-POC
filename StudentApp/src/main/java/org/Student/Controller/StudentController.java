package org.Student.Controller;

import java.util.Optional;

import org.Student.Entity.StudentModel;
import org.Student.StudentDao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Students")
public class StudentController {
	
	@Autowired
	public StudentRepository studentrepository;
	
	//GET call
	
	@GetMapping("/GetallDetails")
	public Iterable<StudentModel> GetDetails(){
		return studentrepository.findAll();
	}
	
	@PostMapping ("/Addetails")
	public void AddDetails( @RequestBody StudentModel studentmodel) {
		studentrepository.save(studentmodel);
	}
	
	@PutMapping("/UpdateDetails/{GenericId}")
	public void UpdateDetails( @RequestBody StudentModel studentmodel ,@PathVariable int GenericId) {
		studentrepository.save(studentmodel);
	}
	
	@DeleteMapping("/{GenericId}")
	public void DeleteDetails(@PathVariable("GenericId") int GenericId) {

		studentrepository.deleteById(GenericId);
	}
	
	
	
		@GetMapping("/{GenericId}")
	public Optional<StudentModel> StudentbySTD(@PathVariable("GenericId") int GenericId) {

		return studentrepository.findById(GenericId);
	}
	
	
	
	
	

}
