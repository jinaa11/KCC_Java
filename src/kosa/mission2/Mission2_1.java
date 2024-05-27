package kosa.mission2;

import java.util.Scanner;

public class Mission2_1 {

	public static int[] solution(int arr[]) {
		int answer[] = new int[arr.length];
		int count = 0;

		answer[count++] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				answer[count++] = arr[i];
			}
		}
		
		int answer2[] = new int[count];
		// 배열 복사 API
		System.arraycopy(answer, 0, answer2, 0, count);
//		for(int i = 0; i < count; i++) {
//			answer2[i] = answer[i];
//		}

		return answer2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer[] = solution(arr);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		
		// 나의 풀이
//		int n;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//
//		int arr[] = new int[n];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (i == 0) {
//				System.out.print(arr[i] + " ");
//			} else if (arr[i] > arr[i - 1]) {
//				System.out.print(arr[i] + " ");
//			}
//		}

	}

}
