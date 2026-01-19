package day18;

import java.util.HashSet;

public class CheckElementPresence {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6};
		int n = 5;
		HashSet<Integer> set = new HashSet<>();
		for(int a : arr)
		{
			set.add(a);
		}
		if(set.contains(n)) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element is not present");
		}
	}
}
