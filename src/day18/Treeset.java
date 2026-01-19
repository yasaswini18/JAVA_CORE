package day18;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("kabir");
		set.add("aditya");
		set.add("pawan");
		set.add("devansh");
		System.out.println("ACS : "+set);
		TreeSet<String> tset = (TreeSet)set;
		System.out.println("DECS : "+tset.descendingSet());
	}

}
