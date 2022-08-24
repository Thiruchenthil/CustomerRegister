package com.example.register.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="LOGINPAGE")
@Getter
@Setter
public class loginpage implements Serializable {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cMobileNo;
	private String otp;
	private Integer c2code;
	private Integer nLogin;
	@ManyToOne
	@JoinColumn(name="c_Mobile_no")
	private List<Item> register;
	@Override
	public int hashCode() {
		return Objects.hash(c2code, cMobileNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		loginpage other = (loginpage) obj;
		return Objects.equals(c2code, other.c2code) && Objects.equals(cMobileNo, other.cMobileNo);
	}
	

}
