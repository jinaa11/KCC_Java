package kosa.relation;

import java.util.ArrayList;
import java.util.List;

// 1���� �л�
public class Student {
	private String name;
	private List<Course> courses; // �л��� ������û�� �����

	public Student() {
	}

	public Student(String name) {
		this.name = name;
		courses = new ArrayList<Course>();
	}

	// ������û
	public void register(Course course) {
		// list�� ������û�� ���� �߰�
		courses.add(course);
		// this�� Student ��ü, this -> register �޼ҵ� ȣ���ϴ� Student ��ü
		// ���� ���忡�� student ��ü�� �߰�
		course.addStudent(this);
	}

	public void dropCourse(Course course) {
		// Course ��ü�� �ִ�
		if (courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this);
		}
	}

	public void printMember() {
		System.out.println("�л� �̸�: " + name);
		for (Course course : courses) {
			System.out.println("���� ����: " + course.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}