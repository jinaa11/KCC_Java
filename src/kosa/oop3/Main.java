package kosa.oop3;

public class Main {

	public static void main(String[] args) {
		Work w = new Work();
		Student s = new Student();
		
		Person p = new Person("홍길동", new Role() {
			
			@Override
			public void doing() {
				System.out.println("드라이빙 역할");
			}
		});
		Person p2 = new Person("박길동", s);
		p.doIt();
//		p2.doIt();
		
		

	}

}
