import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean anchor = true;
		List<Student> studs = new ArrayList<Student>();
		List<Teacher> tech = new ArrayList<Teacher>();
		while(anchor == true) {
			System.out.println("Name: ");
			String sname = sc.next();
			System.out.println("Age: ");
			int sage = sc.nextInt();
			System.out.println("Gender: ");
			String sgender = sc.next();
			System.out.println("Email: ");
			String semail = sc.next();
			System.out.println("Subject: ");
			String subject = sc.next();
			System.out.println("Teacher: ");
			String tname = sc.next();
			
			studs.add(new Student(sname,sage,sgender,semail,subject,tname));
			
			System.out.println("Is there another Student(yes/no): ");
			if(sc.next()=="yes") {
				anchor =true;
			}else {
				anchor = false;
				break;
			}
		}
		
//		studs.add(new Student("Jisha",32,"male","jx@gmail.com","Java","prathik"));
//		studs.add(new Student("Chinju",32,"female","cg@gmail.com","Selenium","prathik"));
//		studs.add(new Student("Deepika",32,"female","dj@gmail.com","Dotnet","prathik"));
//		
//		tech.add(new Teacher("Sandeep",32, "male", "sj@gmail.com","Bigdata",2.0));
//		tech.add(new Teacher("Prathik",32,"male","pk@gmail.com","java",1.0));
//		
		
		
		
		for(int i=0; i<studs.size();i++) {
			studs.get(i).printWelcome();
			System.out.println(studs.get(i).getName()+" is learning "+studs.get(i).getSubject()+" in Standford.");
			if(studs.get(i).getGender()== "female") {
				System.out.println("She is joining the freshman class");
			}
			if(studs.get(i).getGender()== "male") {
				System.out.println("He is joining the freshman class");
			}
			System.out.println("");
			System.out.println();
		}
		

		
//		Iterator itr = studs.iterator();
//		while (itr.hasNext()){
//			System.out.println(itr.next());
//			
//		}
//		System.out.println();
//		
//		Iterator itr2 = tech.iterator();
//		while (itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
	}	
}
