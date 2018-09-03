package com.eintrusty.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eintrusty.constant.VariableConstant;
import com.eintrusty.dto.ExpenditureHeaderDto;
import com.eintrusty.model.DataResponse;
import com.eintrusty.service.IExpenditureHeaderService;

@RestController
@RequestMapping("expend")
public class ExpenditureHeaderController {

	@Autowired
	IExpenditureHeaderService expendService;
	
	@GetMapping("all")
	public ResponseEntity<DataResponse> getAllExpenditure(){
		DataResponse data = new DataResponse();
		try{
			Map<String,Object> map = expendService.findAllData();
			String status = (String) map.get("status");
			data.setMessage(VariableConstant.MESSAGESTATUSOK);
			if(status.equalsIgnoreCase(VariableConstant.MESSAGESTATUSOK)){
				
				List<ExpenditureHeaderDto> listData= (List<ExpenditureHeaderDto>) map.get("datas");
				System.out.println("listData " + listData.size());
				if(listData.size() > 0){
					data.setDataResponse(listData);
				}else{
				    data.setDataResponse("Data not Found");
				}
			}
			
			return new ResponseEntity<DataResponse>(data, HttpStatus.OK);
			
		}catch(Exception e){
			data.setMessage(VariableConstant.MESSAGESTATUSERROR +" detail : " + e.getMessage());
			return new ResponseEntity<DataResponse>(data, HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
