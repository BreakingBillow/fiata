package com.explitech.fiata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.explitech.fiata.dao.CompanyMapper;
import com.explitech.fiata.model.Company;
import com.explitech.fiata.model.CompanyExample;
import com.explitech.fiata.service.CompanyService;

public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyMapper companyDao;
	
	public int add(Company record) {
		// TODO Auto-generated method stub
		return companyDao.insertSelective(record);
	}

	public int update(Company record) {
		// TODO Auto-generated method stub
		return companyDao.updateByPrimaryKeySelective(record);
	}

	public int delete(int companyId) {
		// TODO Auto-generated method stub
		return companyDao.deleteByPrimaryKey(companyId);
	}

	public Company find(int companyId) {
		// TODO Auto-generated method stub
		return companyDao.selectByPrimaryKey(companyId);
	}

	public int count(CompanyExample example) {
		// TODO Auto-generated method stub
		return companyDao.countByExample(example);
	}

	public List<Company> list(CompanyExample example) {
		// TODO Auto-generated method stub
		return companyDao.selectByExample(example);
	}

}
