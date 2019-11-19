package com.revature.dao;

import com.revature.model.UserInfo;

public interface UserDao {

	UserInfo login(String username, String password);
	
}
