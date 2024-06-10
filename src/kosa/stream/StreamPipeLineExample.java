package kosa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("ȫ�浿", 10), new Student("�ſ��", 20), new Student("���̼�", 30));

//		Stream<Student> studentStream = list.stream();
//		// �߰� ó��(�л� ��ü�� ������ ����)
//		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
//		// ���� ó��(��� ����)
//		double avg = scoreStream.average().getAsDouble();
//		
//		list.stream().mapToInt(s -> s.getScore()) // �߰� ���� ��Ʈ��
//				.forEach(score -> System.out.println(score));

//		list.stream().map(Student::getName)
//					.forEach(name -> System.out.println(name));

		// ȫ���� �����ϴ� �̸��� ����
		list.stream().filter(s -> s.getName().startsWith("ȫ"))
					.forEach(s -> System.out.println(s.getName()));

		double avg = list.stream().mapToInt(student -> student.getScore()) // int�� ��Ʈ�� ����(���� ���� ������ �������)
				.average().getAsDouble();

		System.out.println("��� ����: " + avg);

	}

}
