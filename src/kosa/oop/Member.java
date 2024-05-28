package kosa.oop;

public class Member {
	// 회원 정보에 대한 클래스와 객체를 생성 후 출력해봅시다.
	// 상태, 행동 구성
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
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println("휴대폰 번호: " + phone);
	}

}
