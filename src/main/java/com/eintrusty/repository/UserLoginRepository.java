package com.eintrusty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eintrusty.entity.UserLogin;

public interface UserLoginRepository extends CrudRepository<UserLogin, String>{
	
	@Query("select u from UserLogin u where u.username =:username and u.password =:password")
	List<UserLogin> getActiveUser(@Param("username") String username, @Param("password") String password);
	
	

}
