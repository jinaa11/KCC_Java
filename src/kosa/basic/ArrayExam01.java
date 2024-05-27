package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 1. 배열 선언, 생성 분리
//		int arr[]; // 배열 선언
//		arr= new int[5]; // 배열 생성(메모리 할당 이루어짐)
		
		// 2. 배열 선언과 생성 함께
//		int arr2[] = new int[5];
//		arr2[0] = 10;
//		arr2[1] = 20;
		
		// 3. 배열 선언, 생성, 초기화 함께
//		int arr3[] = {1,2,3,4,5};
		
		// 배열에 있는 내용 전체 출력 for (0~4)
//		for(int i=0; i < arr3.length ; i++) {
//			System.out.println("arr3["+i+"]=" + arr3[i]);
//		}
		
		// 향상된 for문 -> 전체를 출력, 인덱스는 알 수 X, 비어있는 인덱스가 있는 경우는 사용 x
//		for(int n : arr3) {
//			System.out.print(n + ",");
//		}
		
		// 향상된 for문은 안에 있는 데이터만 출력할 용도로만 사용할 경우!
		// 인덱스도 같이 사용하면서 데이터를 출력할 거면 for문
		
		
		// 배열 사용 방법
		// 1. 배열에 사용될 데이터 타입 결정
		// 2. 배열의 크기를 결정 =>배열의 크기를 초과할 경우 ArrayIndexOfBoundsException 예외 발생
		// 3. 배열 생성 방법 => 위의 1, 2, 3 번 방법 중 선택
		// 4. 배열을 어떻게 초기화할 것인지? => 직접 인덱스 접근, for문을 통해서, 생성과 함께 초기화
		// 5. 배열의 데이터를 어떻게 출력할 것인지? => for문, 향상된 for문, 인덱스를 통해 직접 접근할 것인지

		
		// 퀴즈> 키보드로부터 문자열을 입력 받아 배열에 추가한 후 전체를 출력하자
		// "q"를 입력할 때까지 입력을 받는다.
		// 입력 : 홍길동
		// 입력 : 박길동
		// 입력 : q
		// 출력 : 홍길동, 박길동, q
		
		Scanner sc = new Scanner(System.in);

		// 배열의 크기 결정 및 배열에 사용될 데이터 타입 결정
		String sArr[] = new String[10];
		
		// 실제 데이터에 들어갈 인덱스가 몇개인지 모르기 때문에 count 변수를 만든다.
		int count = 0;
		
		while(true) {
			System.out.print("입력 : ");
			// 키보드에서 문자열을 입력 받는다.
			String str = sc.nextLine();
			// 키보드에서 q가 입력될 떄 멈춘다.
			if(str.equals("q")) break;
			// q가 입력되기 전까지 계속해서 인덱스를 1씩 증가시켜준다
			sArr[count++] = str;
			
		}
		
		// q 가 입력되고 나서 q가 입력되기 전의 모든 문자들을 배열 형식에 맞춰서 for문으로 배열에 들어있는 데이터를 출력한다.
		// 인덱스의 개수는 count 개수이므로 배열에서는 count 개수보다는 적어야 한다.
		// 정수 1 ~ 5 => 인덱스 0 ~ 4
		for(int i = 0; i<count ; i++) {
			System.out.print(sArr[i] + ",");
		}
		
	}

}
