package kosa.stream;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	private String gender;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
