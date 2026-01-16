package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Write a Java program that performs the following operations on an ArrayList of Strings:
- Create an ArrayList named cities.
- Add the following city names to the list: "Delhi", "Mumbai", "Chennai", "Kolkata".
- Insert the city "Bangalore" at index 2.
- Display all the cities in the list.
- Check whether the city "Mumbai" exists in the list and print a message:
	If found, print: "Mumbai is present in the list."
	Otherwise, print: "Mumbai is not present in the list."
- Sort the list of cities in alphabetical order and display the sorted list.
- Clear the list and print the final size of the ArrayList.
 */
public class ArrayListOne {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Chennai");
		list.add("Kolkata");
		list.add(2, "Banglore");
		for(String s : list)
		{
			System.out.println(s);
		}
		if(list.contains("Mumbai"))
		{
			System.out.println("Mumbai is present in the list");
		}else {
			System.out.println("Mumbai is not present in the list");
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		list.clear();
		System.out.println("Final size: "+list.size());
		
		
	}

}
