package com.explitech.fiata.service;

import java.util.List;

import com.explitech.fiata.model.Company;
import com.explitech.fiata.model.CompanyExample;

public interface CompanyService {

	int add(Company record);
	int update(Company record);
	int delete(int companyId);
	
	Company find(int companyId);
	
	int count(CompanyExample example);
	List<Company> list(CompanyExample example);
	
}
