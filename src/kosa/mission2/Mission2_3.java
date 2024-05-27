package kosa.mission2;

import java.util.Scanner;

public class Mission2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0, sum = 0;

		// 2차원 배열 값 입력
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// 각 행의 최대합
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				if (max < sum) {
					max = sum;
				}
//				System.out.println("행의 합들: " + arr[i][j] + ", " + sum);
			}
		}
//		System.out.println("!!!!!!행 최대합: " + max);

		// 각 열의 최대합
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[j][i];
				if (max < sum) {
					max = sum;
				}
//				System.out.println("열의 합들: " + arr[j][i] + ", " + sum);
			}
		}
//		System.out.println("!!!!!!열 최대합: " + max);

		// 각 대각선의 최대합
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// 왼쪽 -> 오른쪽 대각선
			sum += arr[i][i];
			if (max < sum) {
				max = sum;
			}
//			System.out.println("대각선의 합들: " + arr[i][i] + ", " + sum);
		}
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// 오른쪽 -> 왼쪽
			sum += arr[i][arr.length - 1 - i];
			if (max < sum) {
				max = sum;
			}
//			System.out.println("!!!대각선의 합들: " + arr[i][arr.length - 1 - i] + ", " + sum);
		}

		System.out.println(max);

	}

}
