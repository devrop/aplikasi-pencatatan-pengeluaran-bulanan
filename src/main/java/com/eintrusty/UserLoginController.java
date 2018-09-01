package com.eintrusty;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eintrusty.constant.VariableConstant;
import com.eintrusty.model.DataResponse;
import com.eintrusty.service.IUserLoginService;
import com.eintrusty.model.*;
import com.eintrusty.dto.*;
@RestController
public class UserLoginController {

	@Autowired
	private IUserLoginService userService;
	
	@GetMapping("all")
	public ResponseEntity<DataResponse> findAllUserLogin(){
		try{
			List<UserDto> listdto = userService.listUser();
			DataResponse response = new DataResponse();
			response.setMessage(VariableConstant.MESSAGESTATUSOK);
			response.setDataResponse(listdto);
			
			return new ResponseEntity<DataResponse>(response, HttpStatus.OK);
		}catch(Exception e){
			String errorException = VariableConstant.MESSAGESTATUSERROR + "  : " + e.getMessage();
			return new ResponseEntity<DataResponse>(new DataResponse(errorException, null), HttpStatus.BAD_REQUEST);
		}
		
		
	}
	@PostMapping("save")
	public ResponseEntity<DataResponse> saveUserlogin(@RequestBody UserDto user){
		try{
			DataResponse response = new DataResponse();
			//int status = userService.save(user);
			Map<String,String> status = userService.saveUser(user);
			if(status.get("errorMessage").equalsIgnoreCase(VariableConstant.MESSAGESTATUSOK)){
				response.setMessage(VariableConstant.MESSAGESTATUSOK);
			}else{
				String error = VariableConstant.MESSAGESTATUSERROR + " : " + status.get("description");
				response.setMessage(error);
			}
			  return new ResponseEntity<DataResponse>(response,HttpStatus.OK);
			
		}catch(Exception e){
			String errorException = VariableConstant.MESSAGESTATUSERROR + " : " + e.getMessage();
			return new ResponseEntity<DataResponse>(new DataResponse(errorException, null), HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
