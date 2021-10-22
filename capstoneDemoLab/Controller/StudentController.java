package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.StudentModel;
import com.example.demo.Repository.StudentRepository;

@CrossOrigin (origins = "http://localhost:3000")
@RestController 
@RequestMapping ("/api")


public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo; 
	
	

	
 
//get request URL: "/api/allstudents"
	
	@GetMapping ("/allstudents")
	public List<StudentModel> getAllStudents(){
		return studentRepo.findAll();
	}
	
	@GetMapping ("/student/{id}")
	public ResponseEntity <StudentModel> getStudentById(@PathVariable int id ){
		StudentModel s = studentRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException());
		System.out.println("get id: "+id);
		return ResponseEntity.ok(s);
	}
	
	//post request
	@PostMapping ("/student/add")
	public StudentModel addItem(@RequestBody StudentModel football) {
		System.out.println("post id: "+ football.toString());
		return studentRepo.save(football);
	}
	
	
	@PutMapping ("/student/{id}")
    public StudentModel updateItem(@PathVariable int id, @RequestBody StudentModel football) {
		StudentModel oldFootball = studentRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException());
		oldFootball.setName(football.getName());
		oldFootball.setGrade(football.getGrade());
		System.out.println("update name: "+ id +  football.toString());
        return studentRepo.save(oldFootball);
    }//end updateItem
	
	@DeleteMapping ("/student/{id}")
	public void deleteItem(@PathVariable int id) {
//		StudentModel football = studentRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException());
		studentRepo.deleteById(id);
		
	}
/*	
 * post request
 *
 * 
 * put request
 * delete request
 * 
 */
	
	
}//end class Student Controller
