package com.example.register.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.register.entity.Register;
import com.example.register.jpa.repo.RegisterRepo;

public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private RegisterRepo registerRepo;

	@Override
	public Register saveRegister(Register cMobileNo) {
		// TODO Auto-generated method stub
		return null;
	}

}


