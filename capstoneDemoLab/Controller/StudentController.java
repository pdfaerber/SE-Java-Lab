package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.StudentModel;
import com.example.demo.Repository.StudentRepository;

@CrossOrigin (origins = "http://localhost:3000")
@RestController 
@RequestMapping ("/api/")


public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo; 
	
	

	
 
//get request URL: "/api/allstudents"
	
	@GetMapping ("/allstudents")
	public List<StudentModel> getAllStudents(){
		return studentRepo.findAll();
	}
	
	@GetMapping ("/students/{id}")
	public ResponseEntity <StudentModel> getStudentById(@PathVariable int id ){
		StudentModel s = studentRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException());
		
		return ResponseEntity.ok(s);
	}
/*	
 * post request
 *
 * @PatchMapping
    public Model updateItem(@RequestBody Model item) {
        return modelService.updateItem(item);
    }
 * put request
 * delete request
 * 
 */
	
	
}
