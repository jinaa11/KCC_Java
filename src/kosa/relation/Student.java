package kosa.relation;

import java.util.ArrayList;
import java.util.List;

// 1명의 학생
public class Student {
	private String name;
	private List<Course> courses; // 학생이 수강신청한 과목들

	public Student() {
	}

	public Student(String name) {
		this.name = name;
		courses = new ArrayList<Course>();
	}

	// 수강신청
	public void register(Course course) {
		// list에 수강신청한 과목 추가
		courses.add(course);
		// this는 Student 객체, this -> register 메소드 호출하는 Student 객체
		// 과목 입장에서 student 객체를 추가
		course.addStudent(this);
	}

	public void dropCourse(Course course) {
		// Course 객체에 있니
		if (courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this);
		}
	}

	public void printMember() {
		System.out.println("학생 이름: " + name);
		for (Course course : courses) {
			System.out.println("수강 과목: " + course.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}