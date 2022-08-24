package com.example.register.service;

import com.example.register.entity.Register;

public interface RegisterService {
	public Register saveRegister(Register cMobileNo);
	public Registers getRegister(Integer cMobileNo);
	public Iterable<Registers> getAllcMobileNo();

}
