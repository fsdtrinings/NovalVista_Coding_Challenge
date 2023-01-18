package com.novalvista.task.service;

import com.novalvista.task.entity.Resource;

public interface ResourceService {

	public Resource getResouceBasedOnFileName(String fileName);
	public Resource changeFileComplitionStatusBasedOnFileName(String fileName,int completionLevel);
	public Resource addNewResource(Resource resource);
}
