package kosa.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExam06 {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("ȫ�浿", 85));
		studentList.add(new Student("ȫ�浿", 92));
		studentList.add(new Student("ȫ�浿", 87));
		
		// Student�� score ��Ʈ������ ��ȯ
		studentList.stream()
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
	}
}
