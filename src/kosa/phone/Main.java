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
			System.out.println("1.�߰� 2.��ü��� 3.�˻� 4.���� 5.���� 6.����");
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
				m.searchPhoneInfo();
				break;
			case "4":
				m.updatePhoneInfo();
				break;
			case "5":
				m.deletePhoneInfo();
				break;
			case "6":
				System.out.println("���α׷� ����");
				return;
			}
		}

	}

}
