package kosa.baseball;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int answer[] = new int[3];
		int arr[] = new int[3];
		Baseball b = new Baseball();

		// 임의의 난수 3개 생성
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (Math.random() * 9) + 1;
			// 중복 숫자 제거
			for (int j = 0; j < i; j++) {
				if (answer[i] == answer[j]) {
					i--;
					break;
				}
			}
		}

		// 3개의 수 입력
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("임의의 세자리 수 입력: ");
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
