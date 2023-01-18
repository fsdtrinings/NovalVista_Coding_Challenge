package com.novalvista.task.dao;

import java.util.List;

import com.novalvista.task.entity.User;

public interface UserDAO {

	public User validateUser(String inputusername,String inputPassword); // return null in case if user do not exist
	public List<String> getRolesByUser(String username);
}
