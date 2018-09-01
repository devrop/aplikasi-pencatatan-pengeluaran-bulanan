package com.eintrusty.service;
import java.util.List;
import java.util.Map;

import com.eintrusty.dto.UserDto;;
public interface IUserLoginService {

	List<UserDto> listUser();
	int save(UserDto userDto);
	int update(UserDto userDto);
	int delete(String idUser);
	UserDto findOneUser(String idUser);
	Map<String,String> saveUser(UserDto userFto);
	UserDto getAtiveUser(UserDto user);
	
	
}
