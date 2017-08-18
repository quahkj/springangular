package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	private final Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String getString() {
		return "Hello world";
	}
}
