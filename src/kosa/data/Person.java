package kosa.data;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		// 나이를 기준으로 오름차순 정렬
		// age는 메소드를 호출하는 애, o.age는 파라미터로 들어오는 애
		if (age > o.age) {
			return 1; // 자리 이동
		} else if (age < o.age) {
			return -1; // 자리 그대로
		}
		return 0;
	}
}
