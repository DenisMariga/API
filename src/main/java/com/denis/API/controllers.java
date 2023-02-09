package com.denis.API;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllers {
	@RequestMapping("/courses")
	public List<Course>courses(){
		return Arrays.asList(new Course(1,"Spring Boot","In28minutes"));
		
	}

}
