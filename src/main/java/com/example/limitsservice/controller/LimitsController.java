package com.example.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitsservice.bean.Limits;

@RestController
public class LimitsController {
	@GetMapping("/limits")
	public Limits retrievelimits() {
		return new Limits(1,1000);
	}
	//new limits

}
