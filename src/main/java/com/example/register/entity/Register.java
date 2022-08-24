package com.example.register.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="REGISTER")
@Getter
@Setter
public class Register implements Serializable {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cName;
	private Integer cMobileNo;
	private String cEmail;
	private Integer c2code;
	private String cGender;
	private Integer cPincode;
	private Integer nFirmId;
	private Integer cBrCode;
	private String cServiceActiveStatus;
	@OneToMany(mappedBy="loginpage")
	private List<Item> items;
	@Override
	public int hashCode() {
		return Objects.hash(c2code);
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
		return Objects.equals(c2code, other.c2code);
	}
	
	
	
}
