package com.my.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoApplicationController {

	@GetMapping("/welcome")
	public String welcome() {
		return "successfully created restservice";
	}
	
	@RequestMapping(value = "/world", method = RequestMethod.GET)
	public String world() {
		return "hello world!";
	}
}
