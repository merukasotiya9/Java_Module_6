package com.CoreJava;
import java.util.Scanner;

public class Lab_3_Calculator 
{
	public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Welcome to the Calculator!");
	        System.out.println("Choose an operation:");
	        System.out.println("1. Addition (+)");
	        System.out.println("2. Subtraction (-)");
	        System.out.println("3. Multiplication (*)");
	        System.out.println("4. Division (/)");
	        System.out.println("5. Greater Than (>)");
	        System.out.println("6. Less Than (<)");
	        System.out.println("7. Equal To (==)");

	        System.out.print("Enter the number of the operation you want to perform (1/2/3/4/5/6/7): ");
	        int operation = sc.nextInt();

	        System.out.print("Enter the first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = sc.nextInt();

	        switch (operation) {
	            case 1:
	                int addition = num1 + num2;
	                System.out.println("The result of " + num1 + " + " + num2 + " = " + addition);
	                break;
	            case 2:
	                int subtraction = num1 - num2;
	                System.out.println("The result of " + num1 + " - " + num2 + " = " + subtraction);
	                break;
	            case 3:
	                int multiplication = num1 * num2;
	                System.out.println("The result of " + num1 + " * " + num2 + " = " + multiplication);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    int division = num1 / num2;
	                    System.out.println("The result of " + num1 + " / " + num2 + " = " + division);
	                } else {
	                    System.out.println("Error! Division by zero.");
	                }
	                break;
	            case 5:
	                boolean greaterThan = num1 > num2;
	                System.out.println("Is " + num1 + " greater than " + num2 + "? " + greaterThan);
	                break;
	            case 6:
	                boolean lessThan = num1 < num2;
	                System.out.println("Is " + num1 + " less than " + num2 + "? " + lessThan);
	                break;
	            case 7:
	                boolean equalTo = num1 == num2;
	                System.out.println("Is " + num1 + " equal to " + num2 + "? " + equalTo);
	                break;
	            default:
	                System.out.println("Invalid input! Please select a valid operation.");
	                break;
	    }
	}

}
