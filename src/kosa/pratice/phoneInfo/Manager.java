package kosa.pratice.phoneInfo;

import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);
	PhoneInfo phone[] = new PhoneInfo[10];
	int count;

	public Manager() {

	}

	public void addPhoneInfo() {
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phoneNo = sc.nextLine();
		System.out.print("�������: ");
		String birth = sc.nextLine();

		phone[count++] = new PhoneInfo(name, phoneNo, birth);
	}

	public void listPhoneInfo() {
		for (int i = 0; i < count; i++) {
			phone[i].print();
		}
	}

	public void searchPhoneInfo() {
		System.out.print("�˻� �̸�: ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (name.equals(phone[i].getName())) {
				phone[i].print();
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}
	}

	public void updatePhoneInfo() {
		System.out.print("������ �̸�: ");
		String name = sc.nextLine();

		for (int i = 0; i < count; i++) {
			if (name.equals(phone[i].getName())) {
				System.out.print("������ ��ȣ: ");
				String newPhone = sc.nextLine();
				phone[i].setPhoneNo(newPhone);
			}
		}
		System.out.println("���� �Ϸ�");
	}

	public void deletePhoneInfo() {
		System.out.print("������ �̸�: ");
		String name = sc.nextLine();

		for (int i = 0; i < count; i++) {
			if (name.equals(phone[i].getName())) {
				for (int j = i; j < count - 1; j++) {
					phone[j] = phone[j + 1];
				}
			}
		}
		count--;
		System.out.println("���� �Ϸ�");
	}

}
