package com.explitech.fiata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.explitech.fiata.dao.UserMapper;
import com.explitech.fiata.model.User;
import com.explitech.fiata.model.UserExample;
import com.explitech.fiata.service.UserService;


public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserMapper userDao;
	
	public int add(User record) {
		// TODO Auto-generated method stub
		return userDao.insertSelective(record);
	}

	public int update(User record) {
		// TODO Auto-generated method stub
		return userDao.updateByPrimaryKeySelective(record);
	}

	public int delete(int UserId) {
		// TODO Auto-generated method stub
		return userDao.deleteByPrimaryKey(UserId);
	}

	public User find(int UserId) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(UserId);
	}

	public int count(UserExample example) {
		// TODO Auto-generated method stub
		return userDao.countByExample(example);
	}

	public List<User> list(UserExample example) {
		// TODO Auto-generated method stub
		return userDao.selectByExample(example);
	}

}
