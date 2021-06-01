
public class BasicsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Product = "+multiply(5,6));
		System.out.println("Product = "+division(10,3));
	}

	public static int multiply(int a, int b) {
		int product = a*b;
		for (int i=1;i<10;i=i+2) {
			System.out.println(i);
		}
		return product;
	}
	
	public static double division(double a, double b) {
		double product = a/b;
		return product;
		
	}
}
