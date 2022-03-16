package com.studentcrud.studentcrud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.studentcrud.studentcrud.exception.ResourceNotFoundException;
import com.studentcrud.studentcrud.model.Student;
import com.studentcrud.studentcrud.repository.StudentRepository;
 


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/stud")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	

    @GetMapping("/students")
    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }
    
    

    
    private List<Student> createList() {
		
	return null;
	}


    
    
    
    
    
    
    
	
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getEmployeeById(@PathVariable(value = "id") Long studentId)
        throws ResourceNotFoundException {
        Student student = studentRepository.findById(studentId)
          .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + studentId));
        return ResponseEntity.ok().body(student);
    }
    
    
    

    
    
    @PostMapping("/students")
    public Student createStudent(@Validated @RequestBody Student student) {
        return studentRepository.save(student);
    }
    
    
    
    
    


    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") Long studentId,
         @Validated @RequestBody Student studentDetails) throws ResourceNotFoundException {
        Student student = studentRepository.findById(studentId)
        .orElseThrow(() -> new ResourceNotFoundException("student not found for this id :: " + studentId));

        student.setEmailId(studentDetails.getEmailId());
        
        
        
        
        
        student.setName(studentDetails.getName());
        student.setCollege(studentDetails.getCollege());
        student.setPhoneno(studentDetails.getPhoneno());
        student.setCourse(studentDetails.getCourse());
        student.setSemister(studentDetails.getSemister());
        student.setPercentage(studentDetails.getPercentage());
        student.setLocation(studentDetails.getLocation());
        student.setCompanypackage(studentDetails.getCompanypackage());
        student.setCompanyplaced(studentDetails.getCompanyplaced());
        
        final Student updatedStudent = studentRepository.save(student);
        return ResponseEntity.ok(updatedStudent);
    }
    
    
    
 
    
    
    @DeleteMapping("/students/{id}")
    public Map<String, Boolean> deleteStudent(@PathVariable(value = "id") Long studentId)
         throws ResourceNotFoundException {
    	Student student = studentRepository.findById(studentId)
       .orElseThrow(() -> new ResourceNotFoundException("student not found for this id :: " + studentId));

    	studentRepository.delete(student);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    
    
    
    
    
    
}


    
    
    
    
    

   

    
    
    
    
   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

  
    
    
    
    
    
    
    
    
    
   
