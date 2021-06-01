
public class OverridingEg extends PolymorphismEg{

	public static void main(String[] args) {
		OverridingEg obj1 = new OverridingEg();
		System.out.println("Product is "+obj1.multiply(4, 8));
		System.out.println(obj1.greet);
		System.out.println(obj1.a);
		

	}

}
