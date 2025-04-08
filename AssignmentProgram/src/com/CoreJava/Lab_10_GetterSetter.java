package com.CoreJava;
class Employee
{
	private String E_name;
	private int age ;
	public String getE_name() 
	{
		return E_name;
	}
	public void setE_name(String e_name) 
	{
		E_name = e_name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
}
public class Lab_10_GetterSetter {

	public static void main(String[] args) 
	{
		Employee E=new Employee();
		E.setE_name("Meru Bharwad");
		System.out.println("Person name is :-"+E.getE_name());
		E.setAge(15);
		System.out.println("Employee Age is :- "+E.getAge());
	}

}
