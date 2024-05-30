package kosa.company;

public class Main {

	public static void main(String[] args) {
		Member m1 = new Member("A123", "홍길동", 25, "서울시 종로구");
		Member m2 = new Member("B123", "김길동", 30, "서울시 송파구");
		
		Team t1 = new Team("1", "인사팀");
		Team t2 = new Team("2", "개발팀");
		Team t3 = new Team("3", "마케팅팀");
		
		Role r1 = new Role("1", "사원");
		Role r2 = new Role("2", "대리");
		Role r3 = new Role("3", "과장");
		Role r4 = new Role("4", "부장");
		
		t1.addRole(r2);
		t1.addRole(r1);
		t2.addRole(r1);
		
		r2.addMember(m2);
		r2.addMember(m1);
		r1.addMember(m1);
		
		t1.print();
		t2.print();
		
	}

}
