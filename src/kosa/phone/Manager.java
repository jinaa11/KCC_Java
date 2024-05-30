package kosa.phone;

import java.util.Scanner;

// ��ȭ��ȣ ���� �������� ���
public class Manager {
//	private PhoneInfo arr[] = new PhoneInfo[10];
	private PhoneInfo arr[];
	private Scanner sc;
	private int count;
	
	public Manager() {
		arr = new PhoneInfo[10];
		sc = new Scanner(System.in);
	}
	
	public void addPhoneInfo() {
		// Ű����κ��� �̸�, ��ȭ��ȣ, ��������� �Է� �޾�
		// PhoneInfo ��ü�� �����ؼ� �迭�� �߰��ϴ� ��
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phoneNo = sc.nextLine();
		System.out.print("�������: ");
		String birth = sc.nextLine();
		
		arr[count++] = new PhoneInfo(name, phoneNo, birth);
	};
	
	public void listPhoneInfo() {
		for(int i = 0; i < count; i++) {
			arr[i].show();
		}
	}
	
	public void searchPhoneInfo() {
		// �˻��ϰ��� �ϴ� �̸����� 1���� PhoneInfo ��ü�� ���� ���
		System.out.print("�˻��� �̸�: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < count; i++) {
			if(name.equals(arr[i].getName())) {
				System.out.println("�˻��� �̸�: " + name);
				arr[i].show();
				idx = i;
			}
		}
		
		// �˻��� ������ ���� ���
		if(idx == -1) {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}
		
	}
}
