package kosa.practice.relation;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("자료구조");
		Course c2 = new Course("컴파일러");
		Course c3 = new Course("알고리즘");
		
		Student s1 = new Student("홍길동");
		Student s2 = new Student("박길동");
		
		s1.register(c1);
		s1.register(c2);
		
		s2.register(c2);
		s2.register(c3);
		s2.removeCourse(c2);
		
		s1.printStudent();
		s2.printStudent();

	}

}
