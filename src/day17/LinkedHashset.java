package day17;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add(10);
		set.add("yash");
		set.add(null);
		set.add(10);
		set.add("hello");
		set.add(null);
		set.add('c');
		System.out.println(set);
		for(Object o : set)
		{
			System.out.println(o);
		}
		System.out.println("--------------");
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
