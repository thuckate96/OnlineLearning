package com.onlinelearning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.onlinelearning.models.Student;
import com.onlinelearning.services.HelloService;

@RestController
@RequestMapping("/hell")
public class HelloController {
	@Autowired
	private HelloService helloService;
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<?> getAllStudent() {  
		return new ResponseEntity<>(helloService.getHello(), HttpStatus.OK); 
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	ResponseEntity<?> insertStudent(HttpEntity<String> httpEntity) {
	    String json = httpEntity.getBody();
	    Gson gson = new Gson();

		// 1. JSON to Java object, read it from a file.
	    Student student = gson.fromJson(json, Student.class);
	    
		System.out.println(student.getAge()+"------------------- student");
		if(helloService.insertStudent(student) == true)
			return new ResponseEntity<>("Success", HttpStatus.CREATED);
		return new ResponseEntity<>("false", HttpStatus.BAD_REQUEST);	
	}
}