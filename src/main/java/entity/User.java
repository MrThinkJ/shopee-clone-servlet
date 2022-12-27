package entity;

public class User {
	private int id;
	private int age;
	private String fullName;
	private String gender;
	private String address;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User() {}
	public User(int id,String fullName, int age, String gender, String address) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	
	
}
