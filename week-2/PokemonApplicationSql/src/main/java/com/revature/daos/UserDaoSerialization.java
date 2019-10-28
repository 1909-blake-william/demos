package com.revature.daos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;

public class UserDaoSerialization implements UserDao {

	@Override
	public int save(User user) {

		// get all user types from the file
		List<User> allUsers = findAll();

		// try with resources will auto close variables such as file streams
		try (ObjectOutputStream outStream = new ObjectOutputStream(
				new FileOutputStream("src/main/resources/users.txt"))) {

			// generate random id
			int randomId = (int) Math.floor(Math.random() * 1000000) + 1;
			user.setId(randomId);
			allUsers.add(user);

			// save user back to the file
			outStream.writeObject(allUsers);
			return randomId;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> findAll() {
		try (ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("src/main/resources/users.txt"))) {

			List<User> users = (List<User>) inStream.readObject();
			return users;

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return new ArrayList<User>();
		} // TODO Auto-generated method stub
	}

	@Override
	public User findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		User u = findByUsername(username);
		if (u == null) {
			return null;
		} else {
			if (u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
	}

	@Override
	public User findByUsername(String username) {
		List<User> users = findAll();
		for (User u : users) {
			if (u.getUsername().equals(username)) {
				return u;
			}
		}
		return null;
	}

}
