package com.spring.boot.sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Gorantla, Eresh on 31/Jan/2020
 **/
@RestController
@RequestMapping("/home")
public class HomeResource {

	@GetMapping
	public ResponseEntity<String> sampleMethod() {
		return ResponseEntity.ok("From Spring Boot");
	}

}
