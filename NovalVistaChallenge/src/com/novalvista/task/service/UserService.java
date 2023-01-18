package com.novalvista.task.service;

import java.util.List;

import com.novalvista.task.entity.User;

public interface UserService {
	public boolean validateUser(String inputusername,String inputPassword); // return null in case if user do not exist
	public List<String> getRolesByUser(String username);
}
