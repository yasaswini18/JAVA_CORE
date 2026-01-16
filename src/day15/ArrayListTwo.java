package day15;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Write a Java program that performs the following using an ArrayList of integers:
- Add the following numbers to the list: 10, 5, 20, 15, 25.
- Insert the number 12 at index 2.
- Print all elements of the list.
- Check if the number 15 exists in the list and print an appropriate message.
- Sort the list in ascending order.
- Remove the number 5 from the list.
- Print the final list and its size.
 */
public class ArrayListTwo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(11);
		list.add(20);
		list.add(15);
		list.add(25);
		
		list.add(2,12);
		
		System.out.println(list);
		
		if(list.contains(15)) {
			System.out.println("15 is present in the list");
		}else {
			System.out.println("15 is not present");
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		int index = list.indexOf(5);
		list.remove(index);
		System.out.println(list);
		System.out.println(list.size());
	}

}
