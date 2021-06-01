package sampleException;
import java.util.*;


public class practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [10];
		int evenCount=0, oddCount=0, zeroCount =0, posCount =0, negCount =0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Please enter value of array element"+i+" :");
			arr[i]=sc.nextInt();
		
		}
		for(int j=0; j<arr.length; j++) {
			
			if(arr[j]!=0) {
				if(arr[j]%2 == 0){
				evenCount++;
				}else {
				oddCount++;
			}}
			if(arr[j]==0) {
				zeroCount++;
			}
			if(arr[j]>0) {
				posCount++;
			}
			if(arr[j]<0) {
				negCount++;
			}
		
		}
		System.out.println("There are "+evenCount+" even numbers.");
		System.out.println("There are "+oddCount+" odd numbers.");
		System.out.println("There are "+posCount+" positive numbers.");
		System.out.println("There are "+negCount+" neg numbers.");
		System.out.println("There are "+zeroCount+" zeros.");
		
	}

}
