package kosa.oop;

public class Member {
	// ȸ�� ������ ���� Ŭ������ ��ü�� ���� �� ����غ��ô�.
	// ����, �ൿ ����
	String name;
	int age;
	String address;
	String phone;
	
	public Member() {}
	
	public Member(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printMember() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�ּ�: " + address);
		System.out.println("�޴��� ��ȣ: " + phone);
	}

}
