package com.eintrusty.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eintrusty.constant.VariableConstant;
import com.eintrusty.dto.UserDto;
import com.eintrusty.entity.RoleLogin;
import com.eintrusty.entity.UserLogin;
import com.eintrusty.repository.RoleLoginRepository;
import com.eintrusty.repository.UserLoginRepository;
import com.eintrusty.utility.UtilityBuilder;

@Service
public class UserLoginService implements IUserLoginService {

	@Autowired
	private UserLoginRepository userLoginRepository;
	
	@Autowired
	private RoleLoginRepository roleLoginRepository;
	
	@Override
	public List<UserDto> listUser() {
		// TODO Auto-generated method stub
		List<UserDto> listDto = new ArrayList();
	    userLoginRepository.findAll().forEach(s -> {	
	    UserDto userDto = new UserDto();
	    userDto.setId(s.getId());
	    userDto.setUsername(s.getUsername());
	    userDto.setPassword(s.getPassword());
	    List<RoleLogin> roleList = roleLoginRepository.findRoleById(s.getRole());
	    String roleName ="";
	    if(roleList.size() > 0){
	    	roleName = roleList.get(0).getRole();
	    }
	    userDto.setRole(roleName);
	    
	    listDto.add(userDto);
	    });
		
		return listDto;
	}

	@Override
	public int save(UserDto userDto) {
		// TODO Auto-generated method stub
		try{
			UserLogin saveUser = new UserLogin();
			saveUser.setId(userDto.getId());
			saveUser.setPassword(userDto.getPassword());
			saveUser.setRole(userDto.getRole());
			saveUser.setEnabled("1");
			saveUser.setCreatedDate(UtilityBuilder.getLocalDate());
			saveUser.setCreatedBy(userDto.getCreatedBy());
			userLoginRepository.save(saveUser);
			return VariableConstant.OK;
		}catch(Exception e){
			return VariableConstant.ERROR;
		}
		
	}

	@Override
	public int update(UserDto userDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String idUser) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDto findOneUser(String idUser) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Map<String, String> saveUser(UserDto userDto) {
		// TODO Auto-generated method stub
		Map<String,String> errorMessage = new HashMap<>();
		try{
			UserLogin saveUser = new UserLogin();
			saveUser.setId(userDto.getId());
			saveUser.setPassword(userDto.getPassword());
			saveUser.setRole(userDto.getRole());
			saveUser.setEnabled("1");
			saveUser.setCreatedDate(UtilityBuilder.getLocalDate());
			saveUser.setCreatedBy(userDto.getCreatedBy());
			userLoginRepository.save(saveUser);
			errorMessage.put("errorMessage", VariableConstant.MESSAGESTATUSOK);
			return errorMessage;
		}catch(Exception e){
			errorMessage.put("errorMessage", VariableConstant.MESSAGESTATUSERROR);
			errorMessage.put("description", e.getMessage());
			return errorMessage;
		}

	}

	@Override
	public UserDto getAtiveUser(UserDto user) {
		// TODO Auto-generated method stub
		try{
			List<UserLogin> listUserLogin = userLoginRepository.getActiveUser(user.getUsername(), user.getPassword());
			UserDto userDto = null;
			if(listUserLogin.size() > 0){
				userDto = new UserDto();
				UserLogin userLogin = listUserLogin.get(0);
				userDto.setUsername(userLogin.getUsername());
				userDto.setRole(userLogin.getRole());
			}
			return userDto;
		}catch(Exception e){
		  return null;
		}
	}

}
