
public class Loops {
	
	public void counter(int a) {
		for(int i = a; i>=0; i--) {
			System.out.print(i);
		}
	}
	
	public void whileCounter(int b){
		int i=0;
		while(i<b) {
			System.out.println(i);
			i++;
		}
	}
	
	public void doWhileCounter(int c) {
		int i = c;
		do {
			System.out.println("hi");
			i--;
		}
		while(i>0);
	
	}
	
	public static void main(String[] arg) {
		Loops l1= new Loops();
		l1.counter(10);
		l1.whileCounter(6);
		l1.doWhileCounter(4);
	}
}
