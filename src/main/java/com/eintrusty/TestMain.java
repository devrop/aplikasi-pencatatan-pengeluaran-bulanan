package com.eintrusty;

import java.util.ArrayList;
import java.util.List;

import com.eintrusty.dto.UserDto;
import com.eintrusty.utility.StringUtility;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TestMain {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//LocalDateTime currentTime = LocalDateTime.now();
		UserDto a = new UserDto();
		a.setId("a");
		UserDto b = new UserDto();
		b.setId("b");
		b.setPassword("Ok");
		UserDto c = new UserDto();
		c.setId("c");
		List<UserDto> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		String encripted = StringUtility.DataListToStringEncrypted(list);
		//System.out.println("Cek " + cek);
		//String encripted = StringUtility.encrypt(cek);
		System.out.println("encryoted " + encripted);
		//Gson gson  = new Gson();
		//StringUtility<UserDto> string = new StringUtility<UserDto>(); 
		//List<UserDto> listb= StringUtility.StringToList(cek, UserDto.class);
		String dec = StringUtility.decrypt(encripted);
		
		List<UserDto> listb = new Gson().fromJson(dec, new TypeToken<List<UserDto>>(){}.getType());
		
		for (UserDto userDto : listb) {
			System.out.println(userDto.getId());
		}
		

	}

	private static int StringToList(String cek) {
		// TODO Auto-generated method stub
		return 0;
	}

}
