package kosa.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExam {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("ȫ�浿", 30));
		list.add(new Student("�ſ��", 10));
		list.add(new Student("���̼�", 20));
		
		// ������ �������� ������������ ������ �� ��Ʈ�� ���
		list.stream()
		.sorted()
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		// ������ �������� ������������ ������ �� ��Ʈ�� ���
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}

}
