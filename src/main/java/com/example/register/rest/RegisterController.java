package com.example.register.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.register.entity.Register;
import com.example.register.service.RegisterService;

@RestController
public class RegisterController {
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/user")
	@ResponseBody
	public Register saveRegistter(@RequestBody Register order) {
		
		return registerService.saveRegister(order);	
	}

	 
	
	@GetMapping("/c2/lc/ms/cust/na/b2c/register")
	@ResponseBody
	public Register getRegister(@PathVariable Integer c_mobile_no) {
		return registerService.getRegister(order);
	
	}
}
