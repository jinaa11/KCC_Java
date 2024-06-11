package kosa.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
			while (it.hasNext()) {
				PhoneInfo p1 = it.next();
				if (p1 instanceof Universe) {
					p1.show();
				}
			}
		}
	}

	public void searchPhoneInfo() throws Exception {
		// �˻��ϰ��� �ϴ� �̸����� 1���� PhoneInfo ��ü�� ���� ���
		System.out.print("�˻��� �̸�: ");
		String name = DataInput.sc.nextLine();
//		int idx = -1;

		PhoneInfo p = list.stream().filter(search -> name.equals(search.getName())).findFirst()
				.orElseThrow(() -> new Exception("�������� �ʴ� �̸��Դϴ�."));

		System.out.println("�˻��� �̸�: " + name);
		p.show();

//		for (int i = 0; i < list.size(); i++) {
//			if (name.equals(list.get(i).getName())) {
//				System.out.println("�˻��� �̸�: " + name);
//				list.get(i).show();
//				idx = i;
//			}
//		}

		// �˻��� ������ ���� ���
//		if (idx == -1) {
//			System.out.println("�������� �ʴ� �̸��Դϴ�.");
//		}

	}

	public void updatePhoneInfo() throws Exception {
		// �̸��� �Է� => �ش� phoneInfo ���� => ���� ��ȭ��ȣ �Է� => ��ȭ��ȣ ������ �Ϸ�
		System.out.print("������ �̸�: ");
		String name = DataInput.sc.nextLine();
//		int idx = -1;
//
//		for (int i = 0; i < list.size(); i++) {
//			if (name.equals(list.get(i).getName())) {
//				System.out.print("������ ��ȣ: ");
//				String newPhone = DataInput.sc.nextLine();
//				// �����͸� ������ ���� setter ���
//				list.get(i).setPhoneNo(newPhone);
//				idx = i;
//			}
//		}
//		System.out.println("���� �Ϸ�");
//
//		if (idx == -1) {
//			System.out.println("�������� �ʽ��ϴ�.");
//		}
		PhoneInfo p = list.stream().filter(update -> name.equals(update.getName())).findFirst()
				.orElseThrow(() -> new Exception("�������� �ʴ� �̸��Դϴ�."));

		System.out.print("������ ��ȣ �Է�: ");
		String newPhone = DataInput.sc.nextLine();
		p.setPhoneNo(newPhone);
		System.out.println("��ȭ��ȣ ������ �Ϸ�Ǿ����ϴ�.");

	}

	public void deletePhoneInfo() throws Exception {
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
//		int idx = -1;
//
//		for (int i = 0; i < list.size(); i++) {
//			if (name.equals(list.get(i).getName())) {
//				idx = i;
//				list.remove(i);
//			}
//		}
//		System.out.println("���� �Ϸ�");
//
//		if (idx == -1) {
//			System.out.println("�������� �ʽ��ϴ�.");
//		}

		PhoneInfo p = list.stream().filter(del -> name.equals(del.getName())).findFirst()
				.orElseThrow(() -> new Exception("�������� �ʴ� �̸��Դϴ�."));

		list.remove(p);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");

	}

	public void sortPhoneInfo() {
		System.out.println("======== ���� ���� ���� ========");
		System.out.println("1.�̸� �������� 2.������� ��������");
		System.out.print("�޴�: ");
		String menu = DataInput.sc.nextLine();
		switch (menu) {
		case "1":
			Collections.sort(list);
			break;
		case "2":
			Collections.sort(list, new Comparator<PhoneInfo>() {

				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if (o1.getBirth().compareTo(o2.getBirth()) > 0) {
						return -1;
					} else if (o1.getBirth().compareTo(o2.getBirth()) < 0) {
						return 1;
					}
					return 0;
				}
			});

			break;
		}
	}
	
	public void writePhoneInfo() {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phoneInfo.txt"));
			oos.writeObject(list); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {}
		}
		System.out.println("������ ���� �Ϸ�");
	}
	
	public void readPhoneInfo() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("phoneInfo.txt"));
			list = (List<PhoneInfo>) ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {}
		}
	}
}
