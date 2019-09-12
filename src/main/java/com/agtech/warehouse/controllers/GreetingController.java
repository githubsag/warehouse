package com.agtech.warehouse.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agtech.warehouse.domain.Greeting;

@RestController
public class GreetingController {
	private static final String template = "world, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@CrossOrigin(origins = "http://localhost:9000")
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(required=false, defaultValue="world") String name)
	{
		System.out.println("====== greeting ! =======");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
