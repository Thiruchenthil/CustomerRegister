package com.example.register.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.register.domain.RegisterDomain;
import com.example.register.domain.RegisterResponse;
import com.example.register.service.RegisterService;

@RestController
public class RegisterController {
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/c2/lc/ms/cust/na/b2c/register")
	@ResponseBody
	public RegisterResponse registerUser(@RequestBody RegisterDomain registerInformation) {
		
		return registerService.saveRegister(registerInformation);	
	}

	 
	
	/*
	 * @GetMapping("/c2/lc/ms/cust/na/b2c/register")
	 * 
	 * @ResponseBody public Register getRegister(@PathVariable Integer c_mobile_no)
	 * { return registerService.getRegister(order);
	 * 
	 * }
	 */
}
