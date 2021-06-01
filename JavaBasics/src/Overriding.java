
public class Overriding {

	public static void main(String[] args) {
		SuperMan sm = new SuperMan();
		JuniorMan jm = new JuniorMan();
		Overriding ov= new Overriding();
		
		jm.method1();
		sm.method1();
		System.out.println(jm.id);
		System.out.println(sm.id);
		//System.out.println(sm.a);
		System.out.println(sm.b);

	}

}
