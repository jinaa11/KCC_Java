package kosa.oop4;

public class Student implements Role {
	private String name;
	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}
	@Override
	public void doing() {
		System.out.println("열심히 공부하자!!!");

	}

}
