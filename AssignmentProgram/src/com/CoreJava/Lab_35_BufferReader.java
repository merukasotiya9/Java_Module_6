//Implement a program that reads a file line by line using BufferedReader
package com.CoreJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab_35_BufferReader 
{

	public static void main(String[] args) throws IOException 
	{
		try {
			BufferedReader br=null;
			br=new BufferedReader(new FileReader("Assignment.txt"));

			String line;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}

}
