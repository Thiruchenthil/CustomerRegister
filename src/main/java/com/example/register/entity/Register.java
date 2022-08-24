package com.example.register.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="REGISTER")
@Getter
@Setter
public class Register implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="c_c2code")
	private Integer cC2code;
	@Column(name="c_name")
	private String cName;
	
	private String cMobileNo;
	private String cEmail;

	private String cGender;
	private String cPincode;
	private Integer nFirmId;
	private Integer cBrCode;
	private String cServiceActiveStatus;
	
	@Override
	public int hashCode() {
		return Objects.hash(cC2code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Register other = (Register) obj;
		return Objects.equals(cC2code, other.cC2code);
	}
	
	/*
	 *  
CREATE TABLE TESTING.REGISTER(
  c_c2code INTEGER PRIMARY KEY,
 c_name varchar(20),
 d_dob date,
 c_mobile_no VARCHAR(20) ,
c_email varchar(20),
c_gender char(10),
c_pincode VARCHAR(10),
n_firm_id INTEGER, 
c_br_code INTEGER, 
c_service_active_status VARCHAR(200));
	 */
	
}
