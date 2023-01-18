package com.novalvista.task.dao;

import com.novalvista.task.entity.Resource;

public interface ResouceDAO {
	
	public Resource getResouceBasedOnFileName(String fileName);
	public Resource changeFileComplitionStatusBasedOnFileName(String fileName,int completionLevel);
	public Resource addNewResource(Resource resource);

}
