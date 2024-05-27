package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// 문자열 비교
//		String a = "abc";
//		String b = "abc";
//		
//		if(a.equals(b)) {
//			System.out.println("같다.");
//		} else {
//			System.out.println("다르다.");
//		}
		// 두 정수와 연산자 문자열을 입력 받아
		// 사칙연산 결과를 출력하시오.(계산기)
		// ex> 정수1: 10
		//     정수2: 20
		//     연산자: +
		// 결과> 30
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자: ");
		String operator = sc.nextLine();
		
	
		double result = 0;
		
		if(operator.equals("+")) {
			result = num1 + num2;
		} else if(operator.equals("-")) {
			result = num1 - num2;
		} else if(operator.equals("*")) {
			result = num1 * num2;
		} else if(operator.equals("/")) {
			result = num1 / num2;
		}
		
		System.out.println("결과: " + result);
	}

}
