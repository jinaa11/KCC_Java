package kosa.oop;

import java.util.Scanner;

public class PhoneInfoMain {

	public static void main(String[] args) {
		PhoneInfo pi = new PhoneInfo();
		while (true) {
			System.out.println("1.�߰� 2.��ü��� 3.�˻� 4.����");
			Scanner sc = new Scanner(System.in);
			System.out.print("�޴�: ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				pi.addPhoneInfo();
				System.out.println("��ȭ��ȣ�� ��ϵǾ����ϴ�.\n");
				break;
			case 2:
				pi.listPhoneInfo();
				break;
			case 3:
				System.out.print("�˻��� �̸�: ");
				String searchName = sc.next();
				pi.searchPhoneInfo(searchName);
				
				break;
			case 4:
				System.out.println("���α׷� ����");
				return;
			}
		}

	}

}
