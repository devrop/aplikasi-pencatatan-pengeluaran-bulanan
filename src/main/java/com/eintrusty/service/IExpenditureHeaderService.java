package com.eintrusty.service;

import java.util.Map;

import com.eintrusty.dto.ExpenditureHeaderDto;

public interface IExpenditureHeaderService {

	
	Map<String,Object> findAllData();
	Map<String,String> save(ExpenditureHeaderDto exxpend);
	Map<String,String> update(ExpenditureHeaderDto exxpend);
	Map<String,String> delete(ExpenditureHeaderDto exxpend);
}
