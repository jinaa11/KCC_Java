package kosa.mission2;

import java.util.Scanner;

public class Mission2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0, sum = 0;

		// 2���� �迭 �� �Է�
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// �� ���� �ִ���
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				if (max < sum) {
					max = sum;
				}
//				System.out.println("���� �յ�: " + arr[i][j] + ", " + sum);
			}
		}
//		System.out.println("!!!!!!�� �ִ���: " + max);

		// �� ���� �ִ���
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[j][i];
				if (max < sum) {
					max = sum;
				}
//				System.out.println("���� �յ�: " + arr[j][i] + ", " + sum);
			}
		}
//		System.out.println("!!!!!!�� �ִ���: " + max);

		// �� �밢���� �ִ���
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// ���� -> ������ �밢��
			sum += arr[i][i];
			if (max < sum) {
				max = sum;
			}
//			System.out.println("�밢���� �յ�: " + arr[i][i] + ", " + sum);
		}
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// ������ -> ����
			sum += arr[i][arr.length - 1 - i];
			if (max < sum) {
				max = sum;
			}
//			System.out.println("!!!�밢���� �յ�: " + arr[i][arr.length - 1 - i] + ", " + sum);
		}

		System.out.println(max);

	}

}
