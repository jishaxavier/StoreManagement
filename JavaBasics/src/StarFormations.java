
public class StarFormations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarFormations sf = new StarFormations();
		sf.decreasePattern(5);
		sf.increasePattern(5);
	}
	
	public void increasePattern(int b) {
		for(int j=0; j<=b;j++) {
			System.out.println(" ");
			for (int i=j; i>0;i--) {
				System.out.print("*");
			}
		}
		
	}
	
	public void decreasePattern(int b) {
		for(int j=b;j>=0;j--) {
			System.out.println(" ");
			for (int i=0; i<=j; i++) {
				System.out.print("*");
			}	
		}
	}

	/*public void trianglePattern() {
		for(int j=0; j<=5; j++) {
			System.out.println(" ");
			for(int i = )
		}
	}*/
}
