package kosa.practice.relation;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("�ڷᱸ��");
		Course c2 = new Course("�����Ϸ�");
		Course c3 = new Course("�˰���");
		
		Student s1 = new Student("ȫ�浿");
		Student s2 = new Student("�ڱ浿");
		
		s1.register(c1);
		s1.register(c2);
		
		s2.register(c2);
		s2.register(c3);
		s2.removeCourse(c2);
		
		s1.printStudent();
		s2.printStudent();

	}

}
