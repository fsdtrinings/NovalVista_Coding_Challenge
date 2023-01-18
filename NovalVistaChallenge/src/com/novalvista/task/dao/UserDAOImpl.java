package com.novalvista.task.dao;

import java.util.List;
import java.util.Optional;

import com.novalvista.task.entity.User;

public class UserDAOImpl implements UserDAO{

	
	List<User> allUsers;
	
	
	public UserDAOImpl() {
	
		allUsers = MyDatabaseConfiguration.allUsers;
		
	}

	@Override
	public User validateUser(String inputusername, String inputPassword) {
		return allUsers.stream().filter((u)->{
			if(u.getUsername().equals(inputusername))
			{
				return true;
			}
			else return false;
		}).findFirst().get();
		
	}

	@Override
	public List<String> getRolesByUser(String username) {
		return allUsers.stream().filter((u)->{
			if(u.getUsername().equals(username))
			{
				return true;
			}
			else return false;
		}).findFirst().get().getRole();
	}
	
	

}
