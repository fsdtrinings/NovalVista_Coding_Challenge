package com.novalvista.task.service;

import com.novalvista.task.dao.ResouceDAO;
import com.novalvista.task.dao.ResourceDAOImp;
import com.novalvista.task.entity.Resource;

public class ResourceServiceImpl implements ResourceService{

	ResouceDAO resourceDao;
	
	
	
	public ResourceServiceImpl() {
		resourceDao = new ResourceDAOImp();
	}

	@Override
	public Resource getResouceBasedOnFileName(String fileName) {
		
		return resourceDao.getResouceBasedOnFileName(fileName);
	}

	@Override
	public Resource changeFileComplitionStatusBasedOnFileName(String fileName, int completionLevel) {
		
		return resourceDao.changeFileComplitionStatusBasedOnFileName(fileName, completionLevel);
	}

	@Override
	public Resource addNewResource(Resource resource) {
		
		return resourceDao.addNewResource(resource);
	}

	
}
