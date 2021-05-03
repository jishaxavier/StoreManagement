
public class Person {
	private String name;
	enum Gender{Male, Female};
	private Gender gender;
	private int age;
	private int mobileNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumer(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
