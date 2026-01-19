package day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {
public static void main(String[] args) {
	Map hm = new HashMap();
	System.out.println(hm.put(1, "kabir")); //null
	System.out.println(hm.put(12.2, 12.5)); //null
	System.out.println(hm.put(1, "mohit")); //kabir
	System.out.println(hm);
	hm.put(10,"XYZ");
	hm.put(12.5, false);
	hm.put(true, 10);
	hm.put('a','a');
	hm.put("LPU", 100);
	System.out.println(hm);
	//{LPU=100, 1=mohit, a=a, 12.5=false, 10=XYZ, 12.2=12.5}

	System.out.println(hm.remove(true));   //10
	System.out.println(hm.remove("LPU"));  //100
	
	System.out.println(hm.containsKey(true)); // false
	System.out.println(hm.containsKey("LPU")); //false
	
	System.out.println(hm.containsValue("XYZ")); //true
	System.out.println(hm.containsValue(10));   //false
	
	System.out.println(hm.get(12.5));  //false
	
	Set entries = hm.entrySet();
	System.out.println("Set: "+entries);
	//Set: [1=mohit, a=a, 12.5=false, 10=XYZ, 12.2=12.5]

	for(Object obj : entries) {
		System.out.println(obj);
	}
	
	Set keys = hm.keySet();
	System.out.println("KEYS: "+keys);
	//KEYS: [1, a, 12.5, 10, 12.2]
	
	Iterator itr = keys.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	Collection values = hm.values();
	System.out.println("VALUES: "+values);
	//VALUES: [mohit, a, false, XYZ, 12.5]

	Iterator itr2 = values.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
	}
}
}
