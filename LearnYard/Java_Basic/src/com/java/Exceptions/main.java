package com.java.Exceptions;

public class main {
	static class ageIinvalidException extends Exception {
		ageIinvalidException() {
			super("Age Invalid message");
		}

		ageIinvalidException(String message) {
			super(message);
		}
	}

	class ExampleThrows {
		// Throws KeyWord is used to throw exception from one class method to other
		// class method and at last it should be handled by any a //bove method
		public static void print() throws ClassNotFoundException {
			Class.forName("Vinit");
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting of Program");
		try {
			int n = Integer.parseInt(args[0]);
			int m = Integer.parseInt(args[1]);
			System.out.println("We have got numbers");
			int result = n / m;
			System.out.println("Division is :" + result);
			ExampleThrows.print();
			if (m < 10) {
				throw new ageIinvalidException();
			}
		} catch (ArithmeticException e) {
			System.out.println("Error " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number:" + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// always get executes irrespective of try catch
			System.out.println("I am in finally block");
		}
		System.out.println("Ending of program");
	}

}
