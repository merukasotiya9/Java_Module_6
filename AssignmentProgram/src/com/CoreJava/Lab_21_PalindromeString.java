package com.CoreJava;

import java.util.Scanner;

public class Lab_21_PalindromeString 
{

	public static void main(String[] args)
	{
		Scanner mz=new Scanner(System.in);
		System.out.println("Enter Any String :- ");
		String str=mz.nextLine();
		String rev="";
		
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("String is Palindrome..");
		}
		else
		{
			System.out.println("String is Not Palindrome..");
		}
	}

}
