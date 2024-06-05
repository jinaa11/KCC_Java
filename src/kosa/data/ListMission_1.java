package kosa.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission_1 {

	public static void main(String[] args) {
		// List �ڷᱸ���� Ȱ���Ͽ� Ű����κ��� ���ڿ��� �Է¹޾� ó������.
		// 1. ������ �߰� 2. ������ ���� 3. ������ ���(for, Iterator) 4. ����
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<String>();
		int idx = 0;
		
		while(true) {
			System.out.println("1.������ �߰� 2.������ ���� 3.������ ��� 4.����");
			System.out.print("�޴�: ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				System.out.print("�߰�: ");
				list.add(sc.nextLine());
				break;
			case "2":
				System.out.print("����: ");
				idx = list.indexOf(sc.nextLine());
				if(idx != -1) {
					list.remove(idx);
				} else {
					System.out.println("�������� �ʽ��ϴ�.");
				}
				break;
			case "3":
//				for(int i = 0; i < list.size(); i++) {
//					System.out.print(list.get(i) + ", ");
//				}
				Iterator<String> iter = list.iterator();
				
				while(iter.hasNext()) { // ���� ������ �ִ���
					System.out.println(iter.next()); // iterator�� ���� �����͸� �ϳ��� ����
				}
				
				System.out.println();
				break;
			case "4":
				System.out.println("���α׷� ����");
				return;
			}
		}
	}

}
