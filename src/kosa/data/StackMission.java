package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// Ű����� ���� ������ �Է�
		// ((2+3) + 10) = ��ȣ ��ġ / ����ġ �Ǵ� -> ��ȣ 3���� ������ ����ġ
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		System.out.print("���� ���� �Է�: ");
		String str = sc.nextLine();

		try {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == '(') {
					stack.push(ch + "");
				} else if (ch == ')') {
					stack.pop();
				}
			}

			if (stack.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			} else {
				System.out.println("��ȣ�� ����ġ�մϴ�.");
			}
		} catch (Exception e) {
			System.out.println("��ȣ�� ����ġ�մϴ�.");
		}
	}

}
