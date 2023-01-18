package com.novalvista.task.dao;

import java.util.Map;

import com.novalvista.task.entity.Resource;

public class ResourceDAOImp implements ResouceDAO{

	Map<String, Resource> allResouces ;
	

	public ResourceDAOImp() {
		allResouces = MyDatabaseConfiguration.allResources;
	}

	@Override
	public Resource getResouceBasedOnFileName(String fileName) {
		
		return allResouces.get(fileName);
	}

	@Override
	public Resource changeFileComplitionStatusBasedOnFileName(String fileName,int completionLevel) {
		
		Resource resource = getResouceBasedOnFileName(fileName);
		
		if(resource != null)
		{
			resource.setCompleted(completionLevel);
			allResouces.put(fileName, resource);
			return resource;
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public Resource addNewResource(Resource resource) {
		
		return null;
	}

	
}
