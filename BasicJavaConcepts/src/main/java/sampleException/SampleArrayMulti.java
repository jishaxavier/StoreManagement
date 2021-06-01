package sampleException;

public class SampleArrayMulti {

	public static void main(String[] args) {
		String a[][] = new String[5][2];
		a[0][0] = "First_Name";
		a[0][1] = "Last_Name";
		a[1][0] = "Prathik";
		a[1][1] = "Kumar";
		a[2][0] = "Jisha";
		a[2][1] = "Xavier";
		a[3][0] = "Chinju";
		a[3][1] = "George";
		a[4][0] = "Deepika";
		a[4][1] = "Sudhakaran";
		
		for(int i = 0; i<5;i++) {
			for(int j=0; j<2; j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
