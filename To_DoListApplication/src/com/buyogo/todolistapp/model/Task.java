package com.buyogo.todolistapp.model;

public class Task {

	private String taskDetail;


	public Task(String taskDetail) {
		this.taskDetail = taskDetail;
	}
	
	public String getTaskDetail() {
		return taskDetail;
	}

	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}

	@Override
	public String toString() {
		return taskDetail;
	}

	
	
}
