package kosa.practice.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses;
	
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>();
	}
	
	public void register(Course course) {
		courses.add(course);
		course.addStudent(this);
	}
	
	public void removeCourse(Course course) {
		if(courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this);
		}
	}
	
	public void printStudent() {
		System.out.println("학생 이름: " + name);
		for(Course c : courses) {
			System.out.println("수강 과목: " + c.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}
