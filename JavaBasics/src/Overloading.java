
public class Overloading {

	int a;
	int b;
	
	public int sum(int a,int b) {
		int sum = a+b;
		return sum;
	}
	public int sum(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	public double sum(double a, double b) {
		double sum = a+b;
		return sum;
	}
	public Overloading(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public Overloading() {
		
	}
	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.sum(3, 4, 6);

	}

}
