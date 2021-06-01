
public class Teacher extends Person{
	private String subject;
	private double salary;
	public Teacher() {
		
	}
	public Teacher(String name, int age, String gender, String email, String subject, double salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.subject = subject;
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void printWelcomeTeacher() {
		System.out.println("Welcome "+this.name+" to Stanford University");
	}
	
}
