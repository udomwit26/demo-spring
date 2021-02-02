package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/home")
	public String home() {
		
		return "hello tong";
	}
	
	@GetMapping("users")
	public List getUser() {
		
		List users = new ArrayList();
		
		for(int i=0;i<10;i++) {
			User user = new User();
			user.setName("name"+i);
			user.setLastName("lastName"+i);
			user.setAge(i);
			users.add(user);
		}
		
		return users;
	}
	
	@GetMapping("user/{id}")
	public List getUserById(@PathVariable("id") int id) {
		
		List users = new ArrayList();
		
		for(int i=0;i<10;i++) {
			
			if(id == i) {
				User user = new User();
				user.setName("name"+i);
				user.setLastName("lastName"+i);
				user.setAge(i);
				users.add(user);
			}
		}
		
		return users;
	}
	
}
