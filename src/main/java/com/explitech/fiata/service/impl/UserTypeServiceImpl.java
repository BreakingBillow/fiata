package com.explitech.fiata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.explitech.fiata.dao.UserTypeMapper;
import com.explitech.fiata.model.UserType;
import com.explitech.fiata.model.UserTypeExample;
import com.explitech.fiata.service.UserTypeService;

public class UserTypeServiceImpl implements UserTypeService {

	@Autowired
	private UserTypeMapper userTypeDao;
	
	public int add(UserType record) {
		// TODO Auto-generated method stub
		return userTypeDao.insertSelective(record);
	}

	public int update(UserType record) {
		// TODO Auto-generated method stub
		return userTypeDao.updateByPrimaryKeySelective(record);
	}

	public int delete(int UserTypeId) {
		// TODO Auto-generated method stub
		return userTypeDao.deleteByPrimaryKey(UserTypeId);
	}

	public UserType find(int UserTypeId) {
		// TODO Auto-generated method stub
		return userTypeDao.selectByPrimaryKey(UserTypeId);
	}

	public int count(UserTypeExample example) {
		// TODO Auto-generated method stub
		return userTypeDao.countByExample(example);
	}

	public List<UserType> list(UserTypeExample example) {
		// TODO Auto-generated method stub
		return userTypeDao.selectByExample(example);
	}

}
