package sampleException;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"Add");
		hm.put(2,"Divide");
		hm.put(2,"cal");
		hm.put(3,"divide");
		hm.put(null,"sub");
		hm.put(null,"catch");
		
		
		//Iterating through the map- cant use iterator
		for(Map.Entry m : hm.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		}
		
		

	}

}
