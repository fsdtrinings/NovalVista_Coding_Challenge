package com.novalvista.task;

import java.util.List;
import java.util.Scanner;

import com.novalvista.task.entity.Resource;
import com.novalvista.task.service.ResourceService;
import com.novalvista.task.service.ResourceServiceImpl;
import com.novalvista.task.service.UserService;
import com.novalvista.task.service.UserServiceImpl;

public class MainClass {

	Scanner sc = new Scanner(System.in);
	UserService userService;
	ResourceService resourceService;
	
	public MainClass() {
		userService = new UserServiceImpl();
		resourceService = new ResourceServiceImpl();
	}
	
	
	public static void main(String[] args) {
		
		MainClass app = new MainClass();
		
		List<String> allRoles = app.doLogin();
		
		if(allRoles != null)
		{
			
			while(true)
			{
				
				
				System.out.println(" ----- MENU ----");
				System.out.println("1. Read Resource");
				System.out.println("2. Update Resource");
				System.out.println("3. Add Resource");
				System.out.println("0. Exit");
				
				
				System.out.println("Enter Choice");
				
				switch(Integer.parseInt(app.sc.nextLine()))
				{
					case 1:
							boolean authorised = false;
							for (String role : allRoles) {
								if(role == "view")
								{
									authorised = true;
									app.displayResource();
									break;
								}
							}
							if(authorised == false)
							{
								System.out.println("user is not authorized to view the resource");
							}
					case 2:
					case 3:
					case 0:
						System.exit(0);
				}
				
			}//end while
			
			
		}
		else
		{
			System.out.println("Invalid User details or user not exist");
		}
		
	}
	
	public void displayResource()
	{
		System.out.println("Enter File Name ");
		String fileName = sc.nextLine();
		
		Resource res = resourceService.getResouceBasedOnFileName(fileName);
		if(res != null)
		{
			System.out.println(res);
		}
	}
	
	public List<String> doLogin()
	{
		boolean isValidUser = false;
		
		System.out.println("Enter Username ");
		String inputUsername = sc.nextLine();
		
		System.out.println("Enter Password ");
		String inputPassword = sc.nextLine();
		
		isValidUser = userService.validateUser(inputUsername, inputPassword);
		
		if(isValidUser)
		{
			return userService.getRolesByUser(inputUsername);
		}
		else return null;
	}
}
