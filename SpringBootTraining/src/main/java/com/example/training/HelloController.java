package com.example.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String HelloStudents() {
		return"Hello Students 121";
	}

}
