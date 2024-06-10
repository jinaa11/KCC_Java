package kosa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// List �÷��� ����
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("���ٽ�");
		list.add("�ں���");
		
		// ���� ó��
		Stream<String> parallelStream = list.parallelStream(); // ���� ��Ʈ�� ���
		parallelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}

}
