package kosa.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		// List �ڷᱸ���� Ȱ���Ͽ� Ű����κ��� ���ڿ��� �Է¹޾� ó������.
		// 1. ������ �߰� 2. ������ ���� 3. ������ ���(for, Iterator) 4. ����
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String data = "";

		while (true) {
			System.out.println("1.������ �߰� 2.������ ���� 3.������ ��� 4.����");
			System.out.print("�޴�: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.print("�Է�: ");
				data = sc.nextLine();
				list.add(data);
				break;
			case "2":
				System.out.print("������ ������: ");
				data = sc.nextLine();
				int index = list.indexOf(data);
				list.remove(index);
				break;
			case "3":
//				for (String x : list) {
//					System.out.println(x);
//				}
				Iterator<String> it = list.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case "4":
				System.out.println("���α׷� ����");
				return;
			}
		}
	}

}
