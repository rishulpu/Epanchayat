package com.panchayat.credetial;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.panchayat.LoginDTO;

@RestController
public class Controller {
	
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginDTO login) {
		System.out.println(login.getMobile());
		System.out.println(login.getPassword());
		return ResponseEntity.ok("Ok");
	}
	
	

	
}
