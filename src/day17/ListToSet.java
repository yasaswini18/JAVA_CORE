package day17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(30);
		al.add(25);
		Set<Integer> set = new LinkedHashSet<>(al);
		System.out.println(set);
		
	}
}
