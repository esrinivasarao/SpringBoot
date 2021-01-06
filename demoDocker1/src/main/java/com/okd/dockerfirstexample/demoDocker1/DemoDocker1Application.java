package com.okd.dockerfirstexample.demoDocker1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDocker1Application {
	
	  @GetMapping 
	  public String home(){ 
		  return "Welcome , First Docker Image build program" ;
	  }
	 
	public static void main(String[] args) {
		SpringApplication.run(DemoDocker1Application.class, args);
	}

}
