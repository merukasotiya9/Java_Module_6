//Implement string comparison using equals() and compareTo() methods. 
package com.CoreJava;
import java.util.Scanner;
public class Lab_22_StringMethod 
{
	public static void main(String[] args)
		{
			Scanner mz=new Scanner(System.in);
			System.out.println("Enter first String :- ");
			String str1=mz.nextLine();
			System.out.println("Enter Second String :- ");
			String str2=mz.nextLine();
			
			if(str1.equals(str2))
			{
				System.out.println("String Are Eqauls...");
			}
			else 
			{
				System.out.println("String Are not Eqauls..");
			}
			
			System.out.println("Comapre two string :- "+str1.compareTo(str2));
		}

	}

}
