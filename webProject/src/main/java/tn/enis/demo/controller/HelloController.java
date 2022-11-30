package tn.enis.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello");p
	public String sayHello()
	{System.out.println("lkvsdl");
}
