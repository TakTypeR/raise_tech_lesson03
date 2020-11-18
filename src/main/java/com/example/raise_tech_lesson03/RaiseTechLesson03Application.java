package com.example.raise_tech_lesson03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

//@RestController
//@EnableAutoConfiguration
@SpringBootApplication
public class RaiseTechLesson03Application {

	//@RequestMapping("/")
	//String home(){
	//	return "Hello World!";
	//}

	public static void main(String[] args) {
		SpringApplication.run(RaiseTechLesson03Application.class, args);
	}

}
