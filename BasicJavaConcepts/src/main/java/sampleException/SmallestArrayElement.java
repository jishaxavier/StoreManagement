package sampleException;

public class SmallestArrayElement {
	
	
	public static void main(String[] args) {
		int [] arr1 = { 45, 2, 67, 34, 98, 23 };
		int small = arr1[0];
		int large = arr1[0];

		for (int i=0; i<arr1.length; i++) {
			
			if (arr1[i] < small){
				small = arr1[i];
			}
			
			if(arr1[i]> large) {
				large = arr1[i];
			}
		} 
		System.out.println("smallest = "+small+" and largest = "+large);
		
	}

}
