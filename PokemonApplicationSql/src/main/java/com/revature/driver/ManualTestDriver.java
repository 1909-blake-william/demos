package com.revature.driver;

import java.util.List;

import com.revature.daos.UserDao;
import com.revature.models.User;

public class ManualTestDriver {
	public static void main(String[] args) {
		
		UserDao userDao = UserDao.currentImplementation;
		List<User> users = userDao.findAll();
		users.forEach(user -> {
			System.out.println(user);
		});
		
	}
}
