package com.rg.spring.service;

import java.util.List;

import com.rg.spring.model.User;
import com.rg.spring.dao.UserDao;
import com.rg.spring.dao.UserDaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public void saveUser(User user) {
		dao.saveUser(user);
	}

	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	public void deleteUserByID(int id) {
		dao.deleteUserByID(id);
	}

	public User findByID(int ID) {
		return dao.findByID(ID);
	}

	public void updateUser(User user) {
		dao.saveUser(user);
	}

}
