package com.eintrusty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eintrusty.entity.RoleLogin;


public interface RoleLoginRepository extends CrudRepository<RoleLogin, String> {
	
	@Query("SELECT r FROM RoleLogin r WHERE r.idRole=:role")
	List<RoleLogin> findRoleById(@Param("role") String role);
	

}
