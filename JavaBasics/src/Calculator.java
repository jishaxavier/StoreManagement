import java.util.*;
/**
 * @author jisha
 *
 */
public class Calculator {

	public static void main(String[] args) {
		int a,b;
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a=Integer.parseInt(sc.next());
		System.out.println("Enter second number: ");
		b= Integer.parseInt(sc.next());
		System.out.println("Sum = "+cal.add(a, b));
		System.out.println("Difference = "+cal.sub(a, b));
		System.out.println("Product = "+cal.multiply(a, b));
		System.out.println("Remainder = "+cal.division(a, b));
	}
	public int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public int sub(int a,int b) {
		int diff = a-b;
		return diff;
	}
	public int multiply(int a, int b) {
		int product = a*b;
		return product;
	}
	public double division(double a, double b) {
		double remainder=0;
		if(b == 0) {
			System.out.println("Cannot divide by zero!");
		}else{
			remainder = a/b; 
		}
		return remainder;
	}

}
