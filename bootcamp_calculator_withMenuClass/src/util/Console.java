package util;

import java.util.Scanner;

public class Console {
	
	public static void printWelcome() {
	System.out.println();
	System.out.println();
	System.out.println("			   ** Welcome to the Bootcamp Calculator **");
	}
	
	private static Scanner sc = new Scanner(System.in);
	
    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
            	System.out.println();
                System.out.println("	   Error! Invalid whole number. Try again.");
                System.out.println();
            }
            sc.nextLine();  // discard any other data entered on the line
        }         
        return i;
        
    }

    public static int getIntWithinRange(String prompt,
            int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
            	System.out.println();
                System.out.println("	   Error! Number must be greater than " + min);
                System.out.println();
            } else if (i >= max) {
            	System.out.println();
                System.out.println("	   Error! Number must be less than " + max);
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static String getRequiredString(String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals("")) {
            	System.out.println();
                System.out.println("	   Error! This entry is required. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return s;
    }

    public static String getChoiceString(String prompt,
            String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getRequiredString(prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
            	System.out.println();
                System.out.println("	   Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return s;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
            	System.out.println();
                System.out.println("Error! Invalid number. Try again.");
                System.out.println();
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
            	System.out.println();
                System.out.println(                		
                        "Error! Number must be greater than " + min + ".");
                System.out.println();
            } else if (d >= max) {
            	System.out.println();
                System.out.println(
                        "Error! Number must be less than " + max + ".");
                System.out.println();
            } else {
                isValid = true;
            }
        }
        return d;
    }

	public static void nextLine() {
		
	}	
	}




