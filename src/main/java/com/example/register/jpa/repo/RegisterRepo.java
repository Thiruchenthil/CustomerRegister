package com.example.register.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.register.entity.Register;

public interface RegisterRepo extends CrudRepository<Register, Integer> {

}
