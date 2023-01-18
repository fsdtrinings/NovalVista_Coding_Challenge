package com.novalvista.task.service;

import java.util.List;

import com.novalvista.task.dao.UserDAO;
import com.novalvista.task.dao.UserDAOImpl;
import com.novalvista.task.entity.User;

public class UserServiceImpl implements UserService{

	UserDAO userDao;
	
	public UserServiceImpl() {
		userDao = new UserDAOImpl();
	}
	
	@Override
	public boolean validateUser(String inputusername, String inputPassword) {
		User user = userDao.validateUser(inputusername, inputPassword);
		
		if(user!= null & user.getUsername().equals(inputusername))
			return true;
		else return false;
	}

	@Override
	public List<String> getRolesByUser(String username) {
		
		return userDao.getRolesByUser(username);
	}

	
}
