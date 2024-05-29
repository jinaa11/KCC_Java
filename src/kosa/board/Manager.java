package kosa.board;

import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);
	Board arr[] = new Board[10];
	int cnt;

	public Manager() {
	}

	public void addBoard() {
		System.out.print("����: ");
		String title = sc.nextLine();
		System.out.print("����: ");
		String content = sc.nextLine();

		arr[cnt++] = new Board(cnt, title, content);
	}

	public void listBoard() {
		for (int i = 0; i < cnt; i++) {
			if (arr[i] != null) {
				arr[i].print();
			}
		}
	}

	public void updateBoard() {
		System.out.print("������ �� ��ȣ: ");
//		int num = Integer.parseInt(sc.nextLine());
		int num = sc.nextInt(); // ���� + ����
		sc.nextLine(); // ���� ����

		for (int i = 0; i < cnt; i++) {
			if (arr != null && num == arr[i].getNum()) {
				System.out.print("����: ");
				String title = sc.nextLine();
				System.out.print("����: ");
				String content = sc.nextLine();

				arr[i].setTitle(title);
				arr[i].setContent(content);
			}
		}
		System.out.println(num + "�� �Խñ��� �����Ͽ����ϴ�.");
	}

	public void deleteBoard() {
		System.out.print("������ �� ��ȣ: ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cnt; i++) {
			if (arr[i] != null && num == arr[i].getNum()) {
				arr[i] = null;
				System.out.println(num + "�� ���� �����ƽ��ϴ�.");
			}
		}
	}

}
