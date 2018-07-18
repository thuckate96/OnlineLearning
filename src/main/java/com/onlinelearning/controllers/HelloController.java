package com.onlinelearning.controllers;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController; 
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
	ResponseEntity<?> insertStudent(@RequestBody String json) {
 
		if(helloService.insertStudent(json))
			return new ResponseEntity<>("Success", HttpStatus.CREATED);
		return new ResponseEntity<>("false", HttpStatus.BAD_REQUEST);	
	}
}