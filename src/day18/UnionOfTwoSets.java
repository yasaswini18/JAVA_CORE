package day18;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSets {
public static void main(String[] args) {
	Set<Integer> set1 = new HashSet<>();
	Set<Integer> set2 = new HashSet<>();
	int arr1[] = {1,2,3,4,5};
	int arr2[] = {3,4,5,6,7};
	for(int i : arr1) {
		set1.add(i);
	}
	for(int i : arr2) {
		set2.add(i);
	}
//	Set<Integer> union = new HashSet<>();
//	for(int a : set1) {
//		union.add(a);
//	}
//	for(int a : set2) {
//		union.add(a);
//	}
	
	Set<Integer> union = new HashSet<>(set1);
	union.addAll(set2);
	System.out.println(union);
	
	
}
}
