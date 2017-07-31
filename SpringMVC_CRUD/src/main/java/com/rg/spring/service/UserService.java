package com.rg.spring.service;

import java.util.List;

import com.rg.spring.model.User;

public interface UserService {
	void saveUser(User user);

	List<User> findAllUsers();

	void deleteUserByID(int id);

	User findByID(int i);

	void updateUser(User user);
}
