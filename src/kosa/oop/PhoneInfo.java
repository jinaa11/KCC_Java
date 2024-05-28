package kosa.oop;

import java.util.Scanner;

public class PhoneInfo {
	String name;
	String phoneNo;
	String birth;
	int cnt = 0;
	PhoneInfo arr[] = new PhoneInfo[100];

	public PhoneInfo() {

	}

	public PhoneInfo(String name, String phoneNo, String birth) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	public void addPhoneInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		phoneNo = sc.nextLine();
		System.out.print("�������: ");
		birth = sc.nextLine();

		arr[cnt] = new PhoneInfo(name, phoneNo, birth);
		cnt++;
	}

	public void listPhoneInfo() {
		for (int i = 0; i < cnt; i++) {
			System.out.println("�̸�: " + arr[i].name);
			System.out.println("��ȭ��ȣ: " + arr[i].phoneNo);
			System.out.println("�������: " + arr[i].birth);
		}
	}

	public void searchPhoneInfo(String searchName) {
		for(int i = 0; i < cnt; i++) {
			if(arr[i] != null && arr[i].name.equals(searchName)) {
				System.out.println("�˻� �̸�: " + arr[i].name);
				System.out.println("�̸�: " + arr[i].name);
				System.out.println("��ȭ��ȣ: " + arr[i].phoneNo);
				System.out.println("�������: " + arr[i].birth);
				
			}
		}
		
	}
}
