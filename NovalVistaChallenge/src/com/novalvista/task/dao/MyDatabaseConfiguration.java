package com.novalvista.task.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.novalvista.task.entity.Resource;
import com.novalvista.task.entity.User;

public class MyDatabaseConfiguration {
	
	public static List<User> allUsers = new ArrayList<>(); 
	public static Map<String, Resource> allResources = new HashMap<>(); 
	
	static {
		
		User user1 = new User();
		user1.setUsername("mike");
		user1.setPassword("");
		List<String> rolesForUser1 = Arrays.asList("view");
		user1.setRole(rolesForUser1);
		
		
		User user2 = new User();
		user2.setUsername("jenny");
		user2.setPassword("jenny");
		List<String> rolesForUser2 = Arrays.asList("view","edit","add");
		user2.setRole(rolesForUser2);
		
		
		User user3 = new User();
		user3.setUsername("lee");
		user3.setPassword("lee");
		List<String> rolesForUser3 = null;
		user3.setRole(rolesForUser3);
		
		User user4 = new User();
		user4.setUsername("ramesh");
		user4.setPassword("ramesh");
		List<String> rolesForUser4 = Arrays.asList("add");
		user4.setRole(rolesForUser4);
		
		allUsers = Arrays.asList(user1,user2,user3,user4);
		
		
		Resource r1 = new Resource("File-1","Banking Project-A", 10);
		Resource r2 = new Resource("File-2","Banking Project-B", 40);
		Resource r3 = new Resource("File-3","Banking Project-C", 60);
		
		allResources.put(r1.getFileName(), r1);
		allResources.put(r2.getFileName(), r2);
		allResources.put(r3.getFileName(), r3);
		
		
		
	}

	public static List<User> getAllUsers() {
		return allUsers;
	}

	public static void setAllUsers(List<User> allUsers) {
		MyDatabaseConfiguration.allUsers = allUsers;
	}

	public static Map<String, Resource> getAllResources() {
		return allResources;
	}

	public static void setAllResources(Map<String, Resource> allResources) {
		MyDatabaseConfiguration.allResources = allResources;
	}
	
	

}
