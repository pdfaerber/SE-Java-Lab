package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.StudentModel;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <StudentModel, Integer> {

	List <StudentModel> findByName(String name);
	
	
	
	
	
}
