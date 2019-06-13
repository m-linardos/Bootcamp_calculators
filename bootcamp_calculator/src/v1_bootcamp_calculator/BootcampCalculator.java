package v1_bootcamp_calculator;

import v1_bootcamp_calculator.Console;

public class BootcampCalculator {

	public static void main(String[] args) {

		/// Welcome
		System.out.println();
		System.out.println();
		System.out.println("** Welcome to the Bootcamp Calculator **");

		String choice = "y";

		// Prompt - function menu & selection
		while (choice.equalsIgnoreCase("y")) {
			int userEntry;
			double firstNumber;
			double secondNumber;
			double total;

			// Created displayMenu Method
			System.out.println();
			System.out.println();
			System.out.println("Available functions\n\n" + " 1)  Addition(+)\n" + " 2)  Subtraction(-)\n"
					+ " 3)  Multiplication(x)\n" + " 4)  Division(/)\n" + " 5)  Modulus(%)\n");
			System.out.println();

			userEntry = Console.getInt("Please enter the menu number for the function " + "you would like to use: \n");

			System.out.println();
			firstNumber = Console.getInt("Enter first whole number: \n");
			System.out.println();
			secondNumber = Console.getInt("Enter second whole number: \n");
			System.out.println();

			// Bus Logic - calculations
			if (userEntry == 1) {
				total = firstNumber + secondNumber;
				System.out.println();
				System.out.println(firstNumber + " + " + secondNumber + " = " + total);
				System.out.println();
				System.out.println();
			} else if (userEntry == 2) {
				total = firstNumber - secondNumber;
				System.out.println(firstNumber + " - " + secondNumber + " = " + total);
				System.out.println();
				System.out.println();
			} else if (userEntry == 3) {
				total = firstNumber * secondNumber;
				System.out.println(firstNumber + " x " + secondNumber + " = " + total);
				System.out.println();
				System.out.println();
			} else if (userEntry == 4) {
				total = firstNumber / secondNumber;
				System.out.println(firstNumber + " / " + secondNumber + " = " + total);
				System.out.println();
				System.out.println();
			} else if (userEntry == 5) {
				total = firstNumber % secondNumber;
				System.out.println(firstNumber + " % " + secondNumber + " = " + total);
				System.out.println();
				System.out.println();
			}
			choice = Console.getChoiceString("Continue? (Y/N): ", "y", "n");
			getRequiredString();

		}

		// Bye

		System.out.println("\n Thank you for using the Bootcamp Calculator!");

	}

}

//System.out.println("Continue? (Y/N): "); - changed because scanner in console
//choice = sc.next(); - changed because scanner in console


