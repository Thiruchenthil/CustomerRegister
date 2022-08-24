package com.example.register.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.register.domain.RegisterDomain;
import com.example.register.domain.RegisterResponse;
import com.example.register.entity.Register;
import com.example.register.jpa.repo.RegisterRepo;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepo registerRepo;

	@Override
	public RegisterResponse saveRegister(RegisterDomain registerInformation) {
		
		Register register = new Register();
		
		RegisterResponse resp = new RegisterResponse();
		
		register = registerRepo.findByMobileNbr(registerInformation.getCMobileNo());
		
		if (register != null) {
			resp.setResponse("Mobile Number Already Exist");
		} else {
			register = new Register();
			BeanUtils.copyProperties(registerInformation, register);
			registerRepo.save(register);

			resp.setResponse("Successfully Saved");

		}
		return resp;
	}

}
