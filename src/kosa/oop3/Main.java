package kosa.oop3;

public class Main {

	public static void main(String[] args) {
		Work w = new Work();
		Student s = new Student();
		
		Person p = new Person("ȫ�浿", w);
		Person p2 = new Person("�ڱ浿", s);
		p.doIt();
		p2.doIt();
		
		

	}

}
