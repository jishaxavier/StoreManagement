
public class SampleException {
	
	public static void main(String[] args) {
		int a=4, b=0, c;
		
		try {
			c= a/b;
		}
		catch(Exception e){
			System.out.println("inside exception block");
			System.out.println("exception is "+e.getMessage());
		}
		
		try {
			
		}catch(Exception e1) {
			
		}
		
		finally {
			System.out.println("close the connection");
		}
		System.out.println("Out of exception");

	}

}
