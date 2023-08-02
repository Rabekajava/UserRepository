package com.firstprojects.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Demo
{
	@GetMapping("/Sai")
	public String Example()
	{
		return "Hello";
	}

}
