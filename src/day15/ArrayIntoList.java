package day15;

import java.util.ArrayList;
import java.util.List;

/*
 * Q. WAJP to convert all the elemets of array into List.

 */
public class ArrayIntoList {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		List<Integer> list = new ArrayList<>();
		
		for(int a :  arr)
		{
			list.add(a);
		}
		
		System.out.println(list);
		
	}

}
