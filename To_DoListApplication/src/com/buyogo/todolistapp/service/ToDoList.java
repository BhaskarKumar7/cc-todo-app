package com.buyogo.todolistapp.service;

import java.util.ArrayList;
import java.util.List;

import com.buyogo.todolistapp.model.Task;

public class ToDoList {

	private List<Task> taskDetailsList ;
	
	public ToDoList() {
		 taskDetailsList = new ArrayList<>();
	}
	
	public void createTask( String taskInfo) {
		taskDetailsList.add(new Task(taskInfo));
	}
	
	public void modifyTask(int index, String newTaskDetail) {
		if(index >=0 && index < taskDetailsList.size()) {
			taskDetailsList.get(index).setTaskDetail(newTaskDetail);
		}
		else {
			System.out.println("Incorrect task number.");
		}
	}
	
	public void deleteTask(int index) {
		if (index >= 0 && index < taskDetailsList.size()) {
			taskDetailsList.remove(index);
		}else {
			System.out.println("Incorrect task number.");
		}
	}
	
	public void showAllTasks() {
		if(taskDetailsList.isEmpty()) {
			System.out.println("Tasks are empty.");
		} else {
			System.out.println("************* TASKS LIST *************");
			for(int i=0; i<taskDetailsList.size(); i++) {
				System.out.println((i+1)+" . "+ taskDetailsList.get(i));
			}
		}
	}
}
