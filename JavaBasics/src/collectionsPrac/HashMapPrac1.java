package collectionsPrac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapPrac1 {

	public static void main(String[] args) {
		HashMap<String, String> cityZones = new HashMap<String, String>();
		cityZones.put("Peel","Stay at home");
		cityZones.put("York","Grey");
		cityZones.put("Toronto","Red");
		cityZones.put("Durham","Orange");
		cityZones.put("Hamilton","Yellow");
		cityZones.put("Niagara","Green");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Colour and Regions: "+cityZones);
		System.out.println("Please Enter the region you want to check: ");
		String region = sc.nextLine();
		//System.out.println(region);
		
//		if(cityZones.containsValue(region)) {
//		//System.out.println(region+" is in "+cityZones.get(region)+" region.");
//		System.out.println("hello");
//		}
//		else {
//			System.out.println("bye");
//		}
		
		
		for (Map.Entry<String, String>m : cityZones.entrySet()) {
			//System.out.println(m.getKey()+" "+m.getValue());
			//System.out.println(region);
			if(m.getKey().equalsIgnoreCase(region)) {
				System.out.println(m.getValue()+ " is in "+ m.getKey()+" zone");
				break;
				
			}else {
				System.out.println("Sorry this region is not under GTA");
				
			}
		}
		
	}

}
