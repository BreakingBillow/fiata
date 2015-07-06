package com.explitech.fiata.service;

import java.util.List;

import com.explitech.fiata.model.User;
import com.explitech.fiata.model.UserExample;

public interface UserService {
	int add(User record);
	int update(User record);
	int delete(int userId);
	
	User find(int userId);
	
	int count(UserExample example);
	List<User> list(UserExample example);
}
