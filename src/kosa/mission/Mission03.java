package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		// 임의의 정수 값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하자
		// 5자리 수 ex) 12345
		// 짝수의 개수: 2개
		// 홀수의 개수: 3개
		// 조건 연산자, /, %

		Scanner sc = new Scanner(System.in);
		System.out.print("5자리 정수 입력: ");
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;

		// 삼항연산자 사용
		even += (num / 10000 % 2 == 0) ? 1 : 0;
		even += (num / 1000 % 2 == 0) ? 1 : 0;
		even += (num / 100 % 2 == 0) ? 1 : 0;
		even += (num / 10 % 2 == 0) ? 1 : 0;
		even += (num % 2 == 0) ? 1 : 0;
		
		odd = 5 - even;
		
		System.out.println("짝수의 개수: " + even);
		System.out.println("홀수의 개수: " + odd);

	}

}
