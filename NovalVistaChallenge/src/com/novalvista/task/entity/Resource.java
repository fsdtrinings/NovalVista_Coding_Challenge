package com.novalvista.task.entity;

public class Resource {

	private String fileName;
	private String information;
	private int completed; // file compiltion in %
	

	public Resource() {
		super();
	}
	
	public Resource(String fileName, String information, int completed) {
		super();
		this.fileName = fileName;
		this.information = information;
		this.completed = completed;
	}

	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Resource [fileName=" + fileName + ", information=" + information + ", completed=" + completed + "]";
	}
	

	
	
	
}
