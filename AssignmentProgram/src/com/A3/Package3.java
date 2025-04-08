package com.A3;

import com.A1.Package1;
import com.A2.Package2;

public class Package3 
{

	public static void main(String[] args) 
	{
		Package1 p=new Package1();
		Package2 p1=new Package2();
		p.set_Data("Fortuner", 2025, "toyota", 5, 450000);
		p.display_Data();
		p1.set_Data("Scorpio", 2025, "Mahindra", 5, 180000);
		p1.display_Data();
	}

}
