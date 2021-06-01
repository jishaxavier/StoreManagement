
public class JavaBasics {
	int num1 = 2;
	public int num2 =1;
	protected int num3;
	private double num4 = 4.0;
	
	
	
	public static int sum(int num1,int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	public int sum2(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] arg) {
		System.out.println("Sum is "+ sum(3,5));
		
		JavaBasics jb = new JavaBasics();
		
		System.out.println("Sum is "+jb.sum2(4,6));
	}
	
}
