package com.example.register.service;

import com.example.register.domain.RegisterDomain;
import com.example.register.domain.RegisterResponse;

public interface RegisterService {
	public RegisterResponse saveRegister(RegisterDomain registerInformation);
	//public Registers getRegister(Integer cMobileNo);
	//public Iterable<Registers> getAllcMobileNo();

}
