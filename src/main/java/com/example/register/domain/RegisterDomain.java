package com.example.register.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDomain implements Serializable {
	private Integer cC2code;
	private String cName;
	
	private String cMobileNo;
	private String cEmail;

	private String cGender;
	private String cPincode;
	private Integer nFirmId;
	private Integer cBrCode;
	private String cServiceActiveStatus;
}
