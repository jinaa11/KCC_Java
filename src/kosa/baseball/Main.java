package kosa.baseball;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int answer[] = new int[3];
		int arr[] = new int[3];
		Baseball b = new Baseball();

		// ������ ���� 3�� ����
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (Math.random() * 9) + 1;
			// �ߺ� ���� ����
			for (int j = 0; j < i; j++) {
				if (answer[i] == answer[j]) {
					i--;
					break;
				}
			}
		}

		// 3���� �� �Է�
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ ���ڸ� �� �Է�: ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int sCount = b.checkStrike(arr, answer);
			if (sCount == 3) {
				break;
			}
		}
	}
}
