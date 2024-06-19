package kosa.practice.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();

		while (true) {
			System.out.println("1.�߰� 2.��ü��� 3.�˻� 4.���� 5.���� 6.���� 7.������ ���� 8.������ �ҷ����� 9.����");
			System.out.print("�޴�: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;

			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				m.updatePhoneInfo();
				break;
			case "5":
				m.deletePhoneInfo();
				break;
			case "6":
				m.sortPhoneInfo();
				break;
			case "7":
				m.storePhoneInfo();
				break;
			case "8":
				m.getPhonInfo();
				break;
			case "9":
				System.out.println("���α׷� ����");
				return;
			}

		}

	}

}
