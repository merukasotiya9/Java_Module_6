package com.CoreJava;

import java.util.Scanner;

class Emp_Data
{
	String E_name;
	int age , salary;
	Scanner mz=new Scanner(System.in);
	public void set_data()
	{
		System.out.println("Enter Employee Name :- ");
		E_name=mz.nextLine();
		System.out.println("Enter Employee Age :- ");
		age-=mz.nextInt();
		System.out.println("Enter Employee Salary :- ");
		salary=mz.nextInt();
	}
	public void get_data()
	{
		System.out.println("Employee name is :- "+E_name);
		System.out.println("Employee age is :- "+age);
		System.out.println("Employee salary is :- "+salary);
	}
}
class Department extends Emp_Data
{
	int D_id;
	String D_name;
	public void d_Data()
	{
		D_id=101;
		D_name="Sales";
	}
	public void print_Data()
	{
		get_data();
		System.out.println("Department id is :- "+D_id);
		System.out.println("Department name is :- "+D_name);
	}
}
public class Lab_14_SingleInheritance {

	public static void main(String[] args) 
	{
		Department D = new Department();
		D.set_data();
		D.d_Data();
		D.print_Data();
	}

}
