package com.eintrusty.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eintrusty.constant.VariableConstant;
import com.eintrusty.dto.ExpenditureHeaderDto;
import com.eintrusty.repository.ExpenditureHeaderRepository;

@Service
public class ExpenditureHeaderService implements IExpenditureHeaderService {
	
	@Autowired
	ExpenditureHeaderRepository expendHeaderRepo;

	@Override
	public Map<String, Object> findAllData() {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		try{
			List<ExpenditureHeaderDto> listDt = new ArrayList<>();
			expendHeaderRepo.findAll().forEach(e -> {
				ExpenditureHeaderDto data = new ExpenditureHeaderDto();
				data.setIdHeader(e.getIdHeader());
				data.setIncome(e.getIncome());
				data.setResidu(e.getResidu());
				data.setStatus(e.getStatus());
				data.setTotalOutcome(e.getTotalOutcome());
				listDt.add(data);
				
			});
			System.out.println("list Size" + listDt.size());
			map.put("status", VariableConstant.MESSAGESTATUSOK);
			map.put("datas", listDt);
		return map;
		}catch(Exception e){
			map.put("status", VariableConstant.MESSAGESTATUSERROR);
			map.put("errorDescriptio", e.getMessage());
		
		return map;
		}
	}

	@Override
	public Map<String, String> save(ExpenditureHeaderDto exxpend) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> update(ExpenditureHeaderDto exxpend) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> delete(ExpenditureHeaderDto exxpend) {
		// TODO Auto-generated method stub
		return null;
	}

}
