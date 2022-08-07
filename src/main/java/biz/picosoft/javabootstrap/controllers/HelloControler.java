package biz.picosoft.javabootstrap.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HelloControler {
	@GetMapping("/get")
	public String getHello() { return "hello world" ;}
} 
