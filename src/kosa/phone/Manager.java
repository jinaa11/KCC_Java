package kosa.phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// ��ȭ��ȣ ���� �������� ���
public class Manager extends PhoneInfo {
//	private PhoneInfo arr[];
//	private Scanner sc;
	List<PhoneInfo> list;
	private int count;

	public Manager() {
//		arr = new PhoneInfo[10];
		list = new ArrayList<PhoneInfo>();
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
//			arr[count++] = new PhoneInfo(getName(), getPhoneNo(), getBirth());
			list.add(new PhoneInfo(getName(), getPhoneNo(), getBirth()));
			break;
		// ȸ��
		case "2":
			input();
			System.out.print("�μ�: ");
			dept = DataInput.sc.nextLine();
			System.out.print("��å: ");
			position = DataInput.sc.nextLine();

//			arr[count++] = new Company(getName(), getPhoneNo(), getBirth(), dept, position);
			list.add(new Company(getName(), getPhoneNo(), getBirth(), dept, position));
			break;
		// ��â
		case "3":
			input();
			System.out.print("����: ");
			major = DataInput.sc.nextLine();
			System.out.print("�й�: ");
			year = DataInput.sc.nextLine();

//			arr[count++] = new Universe(getName(), getPhoneNo(), getBirth(), major, year);
			list.add(new Universe(getName(), getPhoneNo(), getBirth(), major, year));

		}
	}

	public void listPhoneInfo() {
		System.out.println("1. ��ü 2. ȸ�� 3.��â");
		System.out.print("�޴�: ");
		String menu = DataInput.sc.nextLine();

		switch (menu) {
		// �Ϲ�
		case "1":
//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i) instanceof PhoneInfo) {
//					((PhoneInfo) list.get(i)).show();
//				}
//			}

			Iterator<PhoneInfo> it = list.iterator();
			while (it.hasNext()) {
				it.next().show();
			}

			break;

		// ȸ��
		case "2":
//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i) instanceof Company) {
//					((Company) list.get(i)).show();
//				}
//			}

			it = list.iterator();
			while (it.hasNext()) {
				PhoneInfo p1 = it.next();
				if (p1 instanceof Company) {
					p1.show();
				}
			}
			break;

		// ��â
		case "3":
//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i) instanceof Universe) {
//					((Universe) list.get(i)).show();
//				}
//			}
			it = list.iterator();
			while(it.hasNext()) {
				PhoneInfo p1 = it.next();
				if(p1 instanceof Universe) {
					p1.show();
				}
			}
		}
	}

	public void searchPhoneInfo() {
		// �˻��ϰ��� �ϴ� �̸����� 1���� PhoneInfo ��ü�� ���� ���
		System.out.print("�˻��� �̸�: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.println("�˻��� �̸�: " + name);
				list.get(i).show();
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

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.print("������ ��ȣ: ");
				String newPhone = DataInput.sc.nextLine();
				// �����͸� ������ ���� setter ���
				list.get(i).setPhoneNo(newPhone);
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

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				idx = i;
				list.remove(i);
			}
		}
		System.out.println("���� �Ϸ�");

		if (idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
}
