package kosa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam08 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("ȫ�浿", "��", 92));
		list.add(new Student("�����", "��", 87));
		list.add(new Student("���ڹ�", "��", 95));
		list.add(new Student("���ؿ�", "��", 93));

		// ���л��� ���� List ����
		List<Student> maleList = list.stream().filter(s -> s.getGender().equals("��")).collect(Collectors.toList());

		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();

		// �л� �̸��� Ű, �л��� ������ ������ ���� Map ����
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
		System.out.println();
	}

}
