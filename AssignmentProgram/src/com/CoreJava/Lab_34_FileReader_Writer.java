//Write a program to read and write content to a file using FileReader and FileWriter. 
package com.CoreJava;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Lab_34_FileReader_Writer 
{
	  public static void main(String[] args) 
	  {
		  try 
	        {
			  	FileWriter fw = new FileWriter("Assignment.txt");
	            fw.write("Hello, Sir");  
	            fw.write("This is My Assignment topic.....");
	            fw.flush();
	            fw.close();
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();  
	        }
	        try 
	        {
	        	FileReader fr = new FileReader("Assignment.txt");
	            int i;
	            while ((i = fr.read()) != -1) 
	            {
	                System.out.print((char) i);  
	            }
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();  
	     }
	 }
}

