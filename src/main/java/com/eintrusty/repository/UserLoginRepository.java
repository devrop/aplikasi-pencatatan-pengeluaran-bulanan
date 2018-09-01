package com.eintrusty.repository;

import org.springframework.data.repository.CrudRepository;

import com.eintrusty.entity.UserLogin;

public interface UserLoginRepository extends CrudRepository<UserLogin, String>{
	
	

}
