package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// �޴��� �����ؼ� �ش� �޴��� ��ɹ��� ������ ����.
		// 1. �߰� 2. ��� 3. �˻� 4. ����
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �߰� 2. ��� 3. �˻� 4. ����");
		System.out.print("�޴� ����: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("�޴��� �߰��Ǿ����ϴ�.");
			break;
		case 2:
			System.out.println("�޴��� ��µǾ����ϴ�.");
			break;
		case 3:
			System.out.println("�˻��Ͻ� �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("����Ǿ����ϴ�.");
			return;
		}

	}

}
