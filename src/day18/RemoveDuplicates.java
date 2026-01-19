package day18;

import java.util.HashSet;

public class RemoveDuplicates {
public static void main(String[] args) {
	int arr[] = {1,2,3,2,1,4,5,2,3};
	HashSet<Integer> set = new HashSet<>();
	for(int a :  arr) {
		set.add(a);
	}
	System.out.println(set);
			
}
}
