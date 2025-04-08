//Write a program that demonstrates inheritance using extends keyword
package com.CoreJava;

import java.util.Scanner;

	class Bapuji
	{
		String B_name;
		int B_age;
		int B_son;
		
		public void b_Detail()
		{
			Scanner ms=new Scanner(System.in);
			System.out.println("Enter Bapuji name :- ");
			B_name=ms.nextLine();
			System.out.println("Enter Bapuji Age :-");
			B_age=ms.nextInt();
			System.out.println("how Many Son,s Of Bapuji:-");
			B_son=ms.nextInt();
		}
	}
	class Papaji extends Bapuji
	{
		String F_name;
		int F_age , F_son;
		
		public void p_detail()
		{
			Scanner ms1=new Scanner(System.in);
			b_Detail();
			System.out.println("Enter Father Name :- ");
			F_name=ms1.nextLine();
			System.out.println("Enter father Age :-");
			F_age=ms1.nextInt();
			System.out.println("how Many Son's of Father:- ");
			F_son=ms1.nextInt();
		}
		
	}
	class Son extends Papaji
	{
		String s_name;
		int S_age ;
		
		public void s_Detail()
		{
			Scanner ms2=new Scanner(System.in);
			System.out.println("Enter Son's name :-");
			s_name=ms2.nextLine();
			System.out.println("Enter Son's age :-");
			S_age=ms2.nextInt();
		}
		public void displayData()
		{
			System.out.println("bapuji name :-"+B_name);
			System.out.println("Bapuji Age :- "+B_age);
			System.out.println("bapuji Son,s :-"+B_son);
			System.out.println("papaji name :-"+F_name+" "+B_name);
			System.out.println("Papaji Age :- "+F_age);
			System.out.println("Papaji Son,s :-"+F_son);
			System.out.println("Son's name :-"+s_name +" "+F_name);
			System.out.println("Son's Age :- "+S_age);
		}
		
}

public class Lab_23_Inheritance_Extends 
{

	public static void main(String[] args) 
	{
		Son s1= new Son();
		s1.p_detail();
		s1.s_Detail();
		s1.displayData();
	}

}
