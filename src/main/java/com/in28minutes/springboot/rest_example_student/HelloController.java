
  package com.in28minutes.springboot.rest_example_student;

	 
	 
	 import org.springframework.web.bind.annotation.GetMapping; import
	 org.springframework.web.bind.annotation.RestController;
	 
	 @RestController 
	 public class HelloController
	 {
	 
	 @GetMapping("/") 
	 public String index() 
	 { 
		 return "Greetings from Spring Boot!";
		 
	 } 
	 
	 }
	
	 