package kosa.phone;

import java.util.Scanner;

// ��ȭ��ȣ ���� �������� ���
public class Manager extends PhoneInfo {
	private PhoneInfo arr[];
//	private Scanner sc;
	private int count;

	public Manager() {
		arr = new PhoneInfo[10];
//		sc = new Scanner(System.in);
	}

	public void addPhoneInfo() {
		// Ű����κ��� �̸�, ��ȭ��ȣ, ��������� �Է� �޾�
		// PhoneInfo ��ü�� �����ؼ� �迭�� �߰��ϴ� ��
		String dept, position, major, year;
		System.out.println("1. �Ϲ� 2. ȸ�� 3.��â");
		System.out.print("�޴�: ");
		String menu = DataInput.sc.nextLine();

		switch (menu) {
		// �Ϲ�
		case "1":
			input();
			arr[count++] = new PhoneInfo(getName(), getPhoneNo(), getBirth());
			break;
		// ȸ��
		case "2":
			input();
			System.out.print("�μ�: ");
			dept = DataInput.sc.nextLine();
			System.out.print("��å: ");
			position = DataInput.sc.nextLine();

			arr[count++] = new Company(getName(), getPhoneNo(), getBirth(), dept, position);
			break;
		// ��â
		case "3":
			input();
			System.out.print("����: ");
			major = DataInput.sc.nextLine();
			System.out.print("�й�: ");
			year = DataInput.sc.nextLine();

			arr[count++] = new Universe(getName(), getPhoneNo(), getBirth(), major, year);
		}
	}

	public void listPhoneInfo() {
		System.out.println("1. ��ü 2. ȸ�� 3.��â");
		System.out.print("�޴�: ");
		String menu = DataInput.sc.nextLine();

		switch (menu) {
		// �Ϲ�
		case "1":
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof PhoneInfo) {
					arr[i].show();
				}
			}
			break;

		// ȸ��
		case "2":
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof Company) {
					((Company) arr[i]).show();
				}
			}
			break;

		// ��â
		case "3":
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof Universe) {
					((Universe) arr[i]).show();
				}
			}
		}
	}

	public void searchPhoneInfo() {
		// �˻��ϰ��� �ϴ� �̸����� 1���� PhoneInfo ��ü�� ���� ���
		System.out.print("�˻��� �̸�: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				System.out.println("�˻��� �̸�: " + name);
				arr[i].show();
				idx = i;
			}
		}

		// �˻��� ������ ���� ���
		if (idx == -1) {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}

	}

	public void updatePhoneInfo() {
		// �̸��� �Է� => �ش� phoneInfo ���� => ���� ��ȭ��ȣ �Է� => ��ȭ��ȣ ������ �Ϸ�
		System.out.print("������ �̸�: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				System.out.print("������ ��ȣ: ");
				String newPhone = DataInput.sc.nextLine();
				// �����͸� ������ ���� setter ���
				arr[i].setPhoneNo(newPhone);
				idx = i;
			}
		}
		System.out.println("���� �Ϸ�");

		if (idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}

	public void deletePhoneInfo() {
		// �̸��� �Է� => ��� ��ü ��ġ �˻� => �ε��� ã�� => �ش� ��ü ���� (�ڿ� ���� ������ 1ĭ�� �ű�� ������ ���� ���� -
		// �ε��� �ϳ� ����)
//		System.out.print("������ �̸� �Է�: ");
//		String name = sc.nextLine();
//		int idx = -1;
//		
//		for(int i = 0; i < count; i++) {
//			if(name.equals(arr[i].getName())) {
//				for(int j = i; j < count - 1; j++) {
//					arr[j] = arr[j+1];
//				}
//				count--;
//			}
//		}
//		System.out.println("���� �Ϸ�");
//		
//		if(idx == -1) {
//			System.out.println("�������� �ʽ��ϴ�.");
//		}

		System.out.print("������ �̸� �Է�: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		} else {
			for (int i = idx; i < count; i++) {
				if (i == arr.length - 1) {
					arr[i] = null;
				} else {
					arr[i] = arr[i + 1];
				}
			}
			count--;
		}
	}
}
