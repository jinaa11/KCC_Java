package kosa.practice.oop2;

public class Student extends Man {
	public Student() {}
	
	public Student(String name) {
		super(name);
	}
	
	public String speak() {
		return getName() + " ���γ� ������ ��";
	}
}
