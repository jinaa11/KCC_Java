package kosa.board;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		while (true) {
			System.out.println("1. �۾��� 2. ��� ��ȸ 3. " + "���� 4. ���� 5. ����");
			System.out.print("�޴�: ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				m.addBoard();
				System.out.println("�� �ۼ��� �Ϸ�ƽ��ϴ�.");
				break;
			case "2":
				m.listBoard();
				break;
			case "3":
				m.updateBoard();
				break;
			case "4":
				m.deleteBoard();
				break;
			case "5":
				System.out.println("���α׷� ����");
				return;
			}
		
		}

	}

}
