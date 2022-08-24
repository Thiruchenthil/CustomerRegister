package com.example.register.jpa.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.register.entity.Register;

public interface RegisterRepo extends CrudRepository<Register, Integer> {
	@Query("from Register where cMobileNo= :mobileNbr")
	public Register findByMobileNbr(@Param("mobileNbr") String mobileNbr);

}
