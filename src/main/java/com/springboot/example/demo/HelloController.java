package com.springboot.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Spring boot";
	}
	
    @GetMapping("/login/{username}/{password}")
    public String login(@PathVariable("username") String username,
    		            @PathVariable("password") String password) {
    	if(username.equals("admin") && password.equals("password")) {
    		return "Login successfull";
    	}
    	else {
    		return "Invalid credentials";
    	}
    }
}
