package day18;

import java.util.HashSet;

public class CommonElementsInTwoArrays {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {3,4,5,6,7};
		HashSet<Integer> set = new HashSet<>();
		int arr[] = new int[arr1.length + arr2.length];
		for(int i :  arr1) {
			set.add(i);
		}
		int j=0;
		for(int i : arr2) {
			if(set.contains(i)) {
				arr[j++]=i;
			}
		}
		for(int i=0;i<j;i++) {
			System.out.println(arr[i]);
		}
	}
}
