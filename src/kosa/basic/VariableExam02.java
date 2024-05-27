package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {
		// 키보드로부터 데이터 입력
		Scanner sc = new Scanner(System.in); // in: inputStream
		
//		System.out.print("정수 입력: ");
		// enter 키 처리 방법 1
//		int num= Integer.parseInt(sc.nextLine()); // nextLine()을 정수형으로 변환
		
		// enter 키 처리 방법 2
		// int num = sc.nextInt(); // 10 + enter
		// sc.nextLine(); // 정수 값을 입력받고 문자열 입력받을 때 
		
//		System.out.print("문자열 입력: ");
//		String str = sc.nextLine();
//		
//		System.out.println(num);
//		System.out.println(str);
		
		// int <==> char
		char ch = 'A';
		System.out.println((int)ch);
		
		// A~Z for 문 이용하여 전체 출력
		for(int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		// int <==> String
		String num2 = "100";
		int num3 = Integer.parseInt(num2);
		int result = num3 + 100;
		System.out.println(result);
		
		int num4 = 10;
		String num5 =String.valueOf(num4); // 정수를 문자열로 변형
		String num6 = num4 + ""; // 문자열 > 정수형, int와 String 캐스팅
		
		String str = 7 + "7" + 7; 
		System.out.println(str);
	}

}
