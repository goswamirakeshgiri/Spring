package com.rg.spring.dao;

import java.util.List;

import com.rg.spring.model.User;

public interface UserDao {
	
	void saveUser(User user);

	List<User> findAllUsers();

	void deleteUserByID(int iD);

	User findByID(int iD);

	void updateUser(User user);

}
