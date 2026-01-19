package day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * WAJP to manage employee salary details using map.
	1. add atleast 6 employee records 
	2. print only those employees whose salary  is greater than 50000
 */
public class ManageEmployeeSalaryDetailsUsingMap {
public static void main(String[] args) {
	Map<Integer,Double> map = new HashMap<>();
	map.put(101,27000.0);
	map.put(102,67000.0);
	map.put(103, 4500.0);
	map.put(104, 62930.0);
	
	Set<Integer> keys = map.keySet();
	Iterator<Integer> it = keys.iterator();
	while(it.hasNext()) {
		Integer d = (Integer)it.next();
		if(map.get(d) >50000) {
			System.out.println(d);
		}
	}
}
}
