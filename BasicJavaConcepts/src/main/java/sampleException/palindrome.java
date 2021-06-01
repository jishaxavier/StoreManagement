package sampleException;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer [] arr = new Integer [5];
		Boolean num = false;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Please enter value of array element"+i+" :");
			arr[i]=sc.nextInt();
		}
		
		//sort using sort()
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr);
		}
		System.out.println(Arrays.toString(arr));
		
		
//		for (int j=0; j<arr.length; j++) {
//			
//			if(arr[j]==arr[arr.length-(j+1)]){
//				num = true;
//				continue;
//			}else{
//				//num = false;
//				System.out.println("Not a palindrome");
//				break;
//			}
//		}
//		if (num == true){
//			System.out.println("It is a palindrome");
//		}
//		

	}

}
