
public class Duck implements Animal{

	public void sound() {
		System.out.println("quack quack");
	}

	public void legs() {
		System.out.println("2");
	}
	
	public void wings() {
		System.out.println("2 wings to fly");
	}

	public static void main(String[] args) {
		Duck d=new Duck();
		d.sound();
	}

}
