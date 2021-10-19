package studentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import capstoneModel.StudentModel;
import exception.ResourceNotFoundException;
import studentRepository.StudentRepository;

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
 * put request
 * delete request
 * 
 */
	
	
}
