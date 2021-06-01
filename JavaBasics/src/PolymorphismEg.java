
public class PolymorphismEg {
	public int a;
	private int b;
	protected int c;
	
	String greet = "hi";
	//Function overloading - Compile time polymorphism
	public int multiply(int a,int b) {
		int product=a*b;
		return product;
	}
	public int multiply(int a, int b, int c) {
		int product=a*b;
		System.out.println(product);
		return product;
	}
	public double multiply(double a, double b) {
		return 3.0;
	}

}
