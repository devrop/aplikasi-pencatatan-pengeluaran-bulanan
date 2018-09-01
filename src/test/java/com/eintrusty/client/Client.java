package com.eintrusty.client;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.eintrusty.dto.UserDto;
import com.eintrusty.model.DataResponse;
import com.eintrusty.utility.StringUtility;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getUserDemo();
		
	}
	public static void getUserDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
	        RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8585/app/all";
	        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
	        ResponseEntity<DataResponse> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, DataResponse.class);
	        DataResponse response = responseEntity.getBody();
	        System.out.println("status " + response.getMessage());
	        String dataResponse = (String) response.getDataResponse();
	        String dec = StringUtility.decrypt(dataResponse);
	        List<UserDto> listb = new Gson().fromJson(dec, new TypeToken<List<UserDto>>(){}.getType());
	        for(UserDto article : listb) {
	              System.out.println("Id:"+article.getId()+", Title:"+article.getUsername()
	                      +", Category: "+article.getRole());
	        }
	    }


}
