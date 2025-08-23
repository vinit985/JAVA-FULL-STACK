package com.project.ProjectQuizGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

	public static ArrayList<String[]> createQuestion() {
		ArrayList<String[]> listOfQuestion = new ArrayList<>();
		listOfQuestion.add(createQuestionArray("Which keyword is used to create a subclass in Java?", "A) implements",
				"B) extends", "C) inherits", "D) override", "B"));
		listOfQuestion.add(createQuestionArray("What is the output of: System.out.println(10 + 20 + \"Java\")?",
				"A) 30Java", "B) Java1020", "C) Java30", "D) 1020Java", "A"));
		listOfQuestion.add(createQuestionArray("Which of these is a valid way to create an object in Java?",
				"A) MyClass obj = new MyClass();", "B) obj = new MyClass();", "C) class obj = MyClass();",
				"D) new MyClass obj();", "A"));
		listOfQuestion.add(createQuestionArray("What is the output of: System.out.println(10 > 5 ? 'Yes' : 'No');",
				"A) Yes", "B) No", "C) true", "D) false", "A"));
		listOfQuestion.add(createQuestionArray("What will be the output of: System.out.println(\"Java\".charAt(2));",
				"A) a", "B) v", "C) J", "D) Exception", "B"));
		return listOfQuestion;
	}

	public static String[] createQuestionArray(String text, String opA, String opB, String opC, String opD,
			String correctAnswer) {
		String[] str = new String[6];
		str[0] = text;
		str[1] = opA;
		str[2] = opB;
		str[3] = opC;
		str[4] = opD;
		str[5] = correctAnswer;
		return str;
	}

	public static void displayQuestion(String[] question) {
		for (int i = 0; i < question.length - 1; i++) {
			System.out.println(question[i]);
		}

	}

	public static void playQuiz() throws InterruptedException {
		int score = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<String[]> questionList = createQuestion();
		Collections.shuffle(questionList);
		for (int i = 0; i < questionList.size(); i++) {
			displayQuestion(questionList.get(i));
			timeLapse();
			System.out.println("Choose answer from [A,B,C,D]");
			String choice = scanner.nextLine();
			while(true)
			{
			  boolean validatedChoice = validateChoice(choice);
			  if(validatedChoice)
			  {
				  break;
			  }
			  else
			  {
				 System.out.println("Please enter correct option from [A,B,C,D]");
				 choice = scanner.nextLine();
			  }
			}
			score = validateWithCorrectAnswer(choice, questionList.get(i), score);

		}
		System.out.println(score);
	}

	public static int validateWithCorrectAnswer(String choice, String[] question, int score) {
		if (choice != null && choice.equalsIgnoreCase(question[question.length - 1])) {
			score += 1;
			return score;
		} else {
			return score;
		}
	}

	public static boolean validateChoice(String choice) {
		String str = choice.trim().toUpperCase();
		if (str.equals("A") || str.equals("B") || str.equals("C") || str.equals("D")) {
			return true;
		} else {
			return false;
		}
	}

	public static void timeLapse() throws InterruptedException {
		System.out.println("You have 10 seconds to think");
		for (int i = 10; i >= 0; i--) {
			System.out.println("\rTime left: " + i);
			Thread.sleep(1000);
		}
		System.out.println("\rTime's up!");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		playQuiz();
	}

}
