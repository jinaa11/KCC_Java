package kosa.oop3;

public class Main {

	public static void main(String[] args) {
		Work w = new Work();
		Student s = new Student();
		
		Person p = new Person("홍길동", w);
		Person p2 = new Person("박길동", s);
		p.doIt();
		p2.doIt();
		
		

	}

}
