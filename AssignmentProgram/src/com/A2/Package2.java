package com.A2;

public class Package2 
{
	String v_Name , model ;
	int price , rate , v_id;
	public void set_Data(String v_Name , int v_id , String model , int rate,int price )
	{
		this.v_Name=v_Name;
		this.v_id=v_id;
		this.model=model;
		this.rate=rate;
		this.price=price;
	}
	public void display_Data()
	{
		System.out.println("Vehicle name is "+v_Name);
		System.out.println("Vehicle id is "+v_id);
		System.out.println("Vehicle age is "+model);
		System.out.println("Vehicle rate is "+rate);
		System.out.println("Vehicle price is "+price);
	}
}
