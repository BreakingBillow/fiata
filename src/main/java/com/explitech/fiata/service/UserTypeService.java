package com.explitech.fiata.service;

import java.util.List;

import com.explitech.fiata.model.UserType;
import com.explitech.fiata.model.UserTypeExample;

public interface UserTypeService {

	int add(UserType record);
	int update(UserType record);
	int delete(int userTypeId);
	
	UserType find(int userTypeId);
	
	int count(UserTypeExample example);
	List<UserType> list(UserTypeExample example);
	
}
