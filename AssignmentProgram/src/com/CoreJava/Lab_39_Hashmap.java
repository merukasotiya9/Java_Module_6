//Create a HashMap to store and retrieve key-value pairs.
package com.CoreJava;

import java.util.HashMap;
import java.util.Map;

public class Lab_39_Hashmap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "kavy");
		map.put(4, "Zeel");
		map.put(5, "meru");
		
		System.out.println("Value for key 2 : "+map.get(2));
		System.out.println("Value for key 4 : "+map.get(4));
		
		for(Map.Entry<Integer,String> entry : map.entrySet())
		{
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		
	}

}
