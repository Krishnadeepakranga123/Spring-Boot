package org.mk.RequestBody.controller;

import org.mk.RequestBody.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@PostMapping("/print")
	public String printDetails(@RequestBody User user) {
		System.out.println("user id :"+user.getId());
		System.out.println("user name :"+user.getName());
		System.out.println("user age :"+user.getAge());
		System.out.println("user phone :"+user.getPhone());
		System.out.println("user email :"+user.getEmail());
		
		return "printed user details";
	}

}
