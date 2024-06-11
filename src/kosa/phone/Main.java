package kosa.phone;

import java.util.Scanner;

// ���α׷��� �帧
public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();

		// ���� while�� �ȿ��� Manager ��ü�� �����ϸ� �迭�� ��������� ���ܼ� ��� �迭�� �ִ��� �����ϱ� �����
		// 3. �˻� �߰� - �̸�
		while (true) {
			System.out.println("1.�߰� 2.��ü��� 3.�˻� 4.���� 5.���� 6.���� 7.������ ���� 8.������ �ҷ����� 9.����");
			System.out.print("�޴� �Է�: ");
			String menu = DataInput.sc.nextLine();

			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				try {
					m.searchPhoneInfo();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "4":
				try {
					m.updatePhoneInfo();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "5":
				try {
					m.deletePhoneInfo();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "6":
				m.sortPhoneInfo();
				break;
			case "7":
				m.writePhoneInfo();
				break;
			case "8":
				m.readPhoneInfo();
				break;
			case "9":
				System.out.println("���α׷� ����");
				return;
			}
		}

	}

}
