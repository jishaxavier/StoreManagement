package sampleException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>(); //CREATE ARRAYLIST
		animals.add("cat");
		animals.add("dog");
		animals.add("dog");
		
		System.out.println(animals.toString());
		if(animals.contains("cat")) {				//contains() - checks if value is present or not
			System.out.println("found cat");
		}
		for(int i = 0; i<animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		animals.add(1,"bugs");
		System.out.println("second="+animals.get(0));
		System.out.println(animals.toString());
//		animals.remove(5);
//		System.out.println(animals.toString());
//		animals.remove("bugs3");
//		System.out.println(animals.toString());
		
		String [] str1 = {"ball", "bat", "stump"};
		List<String> cricket = Arrays.asList(str1);// array to arraylist
		System.out.println(cricket.toString());
		
		String [] str2 = {"tall", "short"};
		List<String> newList = new ArrayList<String>();
		newList.addAll(cricket);
		newList.addAll(Arrays.asList(str2));	//adding to list and array to arrayList
		System.out.println(newList.toString());
		
		//Iterator- hasNext() - returns boolean - check if next value is there
		//			next() - to check value is available
		//			remove() - removes value
		
		Iterator<String> itr = newList.iterator();
		while(itr.hasNext()) {
			//itr.next();
			System.out.println(itr.next());
		}
	}

}
