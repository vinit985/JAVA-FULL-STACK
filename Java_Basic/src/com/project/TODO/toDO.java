package com.project.TODO;

import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class toDO {

	static void operationBasedOnInput(int choice, ArrayList<String> taskList, ArrayList<String> deadLineList) {
		Scanner s = new Scanner(System.in);
		if (choice == 1) {
			addTask(taskList, deadLineList, s);

		} else if (choice == 2) {
			deleteTask(taskList, deadLineList, s);
		} else {
			displayTask(taskList, deadLineList);
		}
	}

	static boolean validateDateOnFormat(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-YYYY");
		try {
			LocalDateTime localDate = LocalDateTime.parse(date, formatter);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	static void addTask(ArrayList<String> taskList, ArrayList<String> deadLineList, Scanner s) {

		System.out.println("Enter task name!");
		String taskName = s.nextLine();
		System.out.println("Enter deadline date in DD-MM-YYYY format");
		String date = s.nextLine();
		boolean validateDate = validateDateOnFormat(date);
		if (!validateDate) {
			System.out.println("Please enter date in correct format : DD-MM-YYYY");
			date = s.nextLine();
		}
		taskList.add(taskName);
		deadLineList.add(date);
		System.out.println("Task has been added successfully");
	}

	static void deleteTask(ArrayList<String> taskList, ArrayList<String> deadLineList, Scanner s) {
		System.out.println("Enter task id to delete task");
		int choice = Integer.parseInt(s.nextLine());
		if (choice > taskList.size() || deadLineList.size() < choice || choice<=0 ) {
			System.out.println("Invalid Choice!,Please Display records and enter");
		}
		taskList.remove(choice-1);
		deadLineList.remove(choice-1);
		System.out.println("Task successfully deleted!");

	}

	static void displayTask(ArrayList<String> taskList, ArrayList<String> deadLineList) {
		if (taskList.isEmpty() && deadLineList.isEmpty()) {
			System.out.println("There is no task and deadLine!,Nothing to display");
		}
		for (int i = 0; i < taskList.size(); i++) {
			System.out.println(
					(i + 1) + "." + "Task Name: " + taskList.get(i) + " " + " DeadLine Date: " + deadLineList.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome  to TODO application!");
		ArrayList<String> taskName = new ArrayList<>();
		ArrayList<String> deadLineList = new ArrayList<>();
		while (true) {
			System.out.println("Choose one operation:");
			System.out.println("1. Add task");
			System.out.println("2. Delete task");
			System.out.println("3. Display task");
			System.out.println("4. Exist");

			String choice = s.nextLine();

			if (Integer.parseInt(choice) == 4) {
				System.out.println("Existing Application! thank you");
				break;
			}
			if (Integer.parseInt(choice) > 4) {
				System.out.println("Invalid Choice,Please select appropriate input for operation");
			}
			operationBasedOnInput(Integer.parseInt(choice), taskName, deadLineList);
		}

	}

}
