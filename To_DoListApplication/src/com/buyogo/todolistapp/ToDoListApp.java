package com.buyogo.todolistapp;

import java.util.Scanner;

import com.buyogo.todolistapp.service.ToDoList;

public class ToDoListApp {

	private static ToDoList toDoList = new ToDoList();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = true;

		while (flag) {
			displayMenu();
			int userChoice = readUserChoice();
			flag = performUserChoice(userChoice);
		}
	}

	private static void displayMenu() {
		System.out.println("************** TO DO LIST MENU ******************");
		System.out.println("1. Create Task");
		System.out.println("2. Modify Task");
		System.out.println("3. Delete Task");
		System.out.println("4. View All Tasks");
		System.out.println("5. Exit");
		System.out.println("Choose one option---------->");
	}

	private static int readUserChoice() {
		int choice = scanner.nextInt();
		scanner.nextLine();
		return choice;
	}

	private static boolean performUserChoice(int choice) {
		switch (choice) {
		case 1:
			addTask();
			break;
		case 2:
			editTask();
			break;
		case 3:
			removeTask();
			break;
		case 4:
			viewAllTasks();
			break;
		case 5:
			return false;
		default:
			System.out.println("Invalid choice,please enter valid one.");
		}
		return true;
	}

	private static void addTask() {
		System.out.println("Enter task information :");
		String info = scanner.nextLine();
		toDoList.createTask(info);
		System.out.println("  Task Created Successfully!!!!!!!!!!!");
	}

	private static void editTask() {
		toDoList.showAllTasks();
		System.out.println("Enter the task number to modify :");
		int taskNum = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter new details for the task :");
		String newTaskDetail = scanner.nextLine();
		toDoList.modifyTask(taskNum - 1, newTaskDetail);
	}

	public static void removeTask() {
		toDoList.showAllTasks();
		System.out.println("Enter a task number to delete a task.");
		int taskNum = scanner.nextInt();
		scanner.nextLine();
		toDoList.deleteTask(taskNum - 1);
	}

	public static void viewAllTasks() {
		toDoList.showAllTasks();
	}
}
