package kosa.phone;

import java.util.Scanner;

// ��ȭ��ȣ ���� �������� ���
public class Manager {
//	private PhoneInfo arr[] = new PhoneInfo[10];
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
		System.out.print("�̸�: ");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("�������: ");
		String birth = DataInput.sc.nextLine();

		arr[count++] = new PhoneInfo(name, phoneNo, birth);
	};

	public void listPhoneInfo() {
		for (int i = 0; i < count; i++) {
			arr[i].show();
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
