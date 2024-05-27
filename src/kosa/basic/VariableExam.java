package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// 변수는 데이터를 담는 그릇 ex) 홍길동, 100, 3.14, true
		// byte, short, int, long, float, double, boolean, char << 기본형 데이터(Primitive Type)
		int num; // 변수 선언: 메모리 할당 << 실제 데이터 값을 담음
		int arr[]; // 배열 선언: Object Type << 참조(실제 데이터 값이 들어있지 않음)
		num = 10; // =: 대입 연산자
		
		// 변수 선언, 초기화
		int num2 = 100;
		
		// 문자열: String - 참조형
		String name = "홍길동";
		System.out.println(name + "님");
		
		// 변수 선언
		// 변수명: 특수문자 X, 숫자 시작X, 소문자로 시작, _
		
		// 기본 리터럴: 100 -> int, "" -> String, 'A' -> char, true -> boolean, 3.14 -> double
		float a = 3.14f; // float 쓰려면 캐스팅 해주기
		
		// casting (형 변환)
		// 기준: byte < short < int < long < float < double, int <=> char
		double b = 100; // 작은 거에서 큰 거로는 자동 캐스팅이 되어서 가능(묵시적 캐스팅)
		int c = (int)3.14;
		System.out.println(c);
		
		float num3 = 3.14f;
		long num4 = 100;
		
		int num5 = 010; // 8진수
		System.out.println(num5);
		
		
	}

}