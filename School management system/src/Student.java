
public class Student extends Person{
	
	private String subject;
	private String teacherName;
	
	
//Person p1 = new Person();
//
//public String pickName() {
//	String pname = p1.getName();
//	return pname;
//}
 
//	public Student() {
//		
//	}
	public Student(String name,int age,String gender,String email,String subject, String teacherName) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.subject = subject;
		this.teacherName = teacherName;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public void printWelcome() {
		System.out.println("Welcome "+this.name+" to Stanford");
	}
  
}
