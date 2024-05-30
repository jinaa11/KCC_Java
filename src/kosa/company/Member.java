package kosa.company;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String id;
	private String name;
	private int age;
	private String address;
	private List<Role> roles;
	
	public Member() {}
	
	public Member(String id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		roles = new ArrayList<Role>();
	}
	
	public void addRole(Role role) {
		roles.add(role);
	}
	
	public void print() {
		
		System.out.println("사원번호: " + id);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println("---------------------");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
