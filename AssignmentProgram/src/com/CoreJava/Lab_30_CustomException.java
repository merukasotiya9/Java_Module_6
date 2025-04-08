//Create a custom exception class and use it in your program.
package com.CoreJava;
class NegativeNumberException extends Exception 
{
	public NegativeNumberException(String message) 
	{
		super(message);
	}
}
public class Lab_30_CustomException 
{

	public static void main(String[] args) 
	{
		try 
		{
			int number = -5;

			if (number < 0) 
			{
				throw new NegativeNumberException("Negative numbers not allowed");
			}

			System.out.println("Number is: " + number);
		} 
		catch (NegativeNumberException e) 
		{
			System.out.println("NegativeNumberException : " + e.getMessage());
		}
	}

}
