
public class AbstractionTest extends Car{

	public int gearbox() {
		return 9;
	}
	public double enginesize() {
		return 6.0;
	}
	public static void main(String[] args) {
		AbstractionTest at = new AbstractionTest();
		System.out.println(at.wheels());
	
		
		

	}

}
