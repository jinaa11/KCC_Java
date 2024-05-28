package kosa.oop;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member(); // 객체 생성 => 인스턴스화: m1 => 인스턴스 변수
		m1.name = "김진아"; // 객체 초기화
		m1.age = 20;
		m1.address = "서울시 종로구";
		m1.phone = "010-1234-5678";
		
		System.out.println();
		
//		Member m2 = new Member();
//		m2.name = "홍길동";
//		m2.age = 30;
//		m2.address = "부산시 해운대구";
//		m2.phone = "010-5555-2222";
		Member m2 = new Member("홍길동", 30, "부산시 해운대구", "010-5555-2525");
		
		m1.printMember();
		System.out.println();
		m2.printMember();
		System.out.println();
		
		Member m3 = new Member("홍길순", 25);
		m3.address = "서울시 송파구";
		m3.phone = "010-7777-1118";
		
		m3.printMember();
		System.out.println();
		
		Member m4;
		m4 = new Member("고영희", 20, "부산시 부산진구", "010-7111-8888");
		
		m4.printMember();
	}

}
