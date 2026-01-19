package day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(10);
		set.add("yash");
		set.add(null);
		set.add(10);
		set.add("hello");
		set.add(null);
		set.add('c');
		System.out.println(set);
		
		for(Object obj : set)
		{
			System.out.println(obj);
		}
		System.out.println("-------------------");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Integer> st = new HashSet<>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(null);
		st.add(null);
		st.add(10);
		System.out.println(st);
		for(Integer a : st)
		{
			System.out.println(a);
		}
		System.out.println("-------------------");
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}
