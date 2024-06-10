package kosa.stream;

import java.util.ArrayList;
import java.util.List;

public class FilteringExam {

	public static void main(String[] args) {
		// List �÷��� ����
		List<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("ȫ�浿");
		list.add("�Ź�ö");
		list.add("�Ź�ö");

		// �ߺ� ��� ����
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();

		// ������ �����ϴ� ��Ҹ� ���͸�
		list.stream().filter(n -> n.startsWith("��")).forEach(n -> System.out.println(n));
		System.out.println();

		// �ߺ� ��Ҹ� ���� �����ϰ�, ������ �����ϴ� ��Ҹ� ���͸�
		list.stream().distinct().filter(n -> n.startsWith("��")).forEach(n -> System.out.println(n));

	}

}
