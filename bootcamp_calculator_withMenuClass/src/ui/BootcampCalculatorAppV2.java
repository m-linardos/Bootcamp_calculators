package ui;

import util.Console;
import ui.Menu;
import business.Calculator;

public class BootcampCalculatorApp_MenuClass {

	public static void main(String[] args) {
		int userEntry;
		double firstNumber;
		double secondNumber;
		double total;	
		
		
	
		// Welcome
		Console.printWelcome();				
		String choice = "y";	

//		Bootcamp userEntry = new Bootcamp(userEntry);
				
				
			// Prompt - function menu & selection		
			while (choice.equalsIgnoreCase("y")) {			
				Menu.getDisplayMenu();	
				
				// reference Sean's calculator in git hub to work on advancing this one
				//Calculator calc = new Calculator(firstNumber, secondNumber);
				
				userEntry = Console.getIntWithinRange("	   Please enter the menu number for the function "
						+ "you would like to use: ", 0, 6);	 				 
				System.out.println();
				firstNumber = Console.getInt("	   Enter first whole number: ");	
				System.out.println();
				secondNumber = Console.getInt("	   Enter second whole number: ");	
				System.out.println();	
					
			// Bus Logic - calculations
					if (userEntry == 1) {	// Addition
						total = firstNumber + secondNumber;
						System.out.println();
						System.out.println("	   " + firstNumber + " + " + secondNumber + " = " + total);	
						System.out.println();
						System.out.println();
					 } else if (userEntry == 2) {	// Subtraction
						total = firstNumber - secondNumber;
						System.out.println("	   " + firstNumber + " - " + secondNumber + " = " + total);
						System.out.println();
						System.out.println();
					 } else if (userEntry == 3)  {	// Multiplication
						total = firstNumber * secondNumber;
						System.out.println("	   " + firstNumber + " x " + secondNumber + " = " + total);	
						System.out.println();
						System.out.println();
					 } else if (userEntry == 4)  {	// Division
						total = firstNumber / secondNumber;
						System.out.println("	   " + firstNumber + " / " + secondNumber + " = " + total);
						System.out.println();
						System.out.println();
					 } else if (userEntry == 5)  { // Modulus
						total = firstNumber % secondNumber;
						System.out.println("	   " + firstNumber + " % " + secondNumber + " = " + total);
						System.out.println();
						System.out.println();
					 } 

					/* System.out.println("Continue? (Y/N): "); 
					choice = sc.next(); - changed because scanner in console - CHANGED TO BELOW */					
					choice = Console.getChoiceString("	   Continue? (Y/N): ", "y", "n");						
				}	
										
			// Bye	
			System.out.println();
			System.out.println("	   Thank you for using the Bootcamp Calculator!");
			
	}
}
	



