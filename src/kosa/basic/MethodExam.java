package kosa.basic;

public class MethodExam {

	// 메서드 정의 -> 중복 최소화, 재사용성
	// 접근 제어자, (static), 리턴형(void), 메서드 이름(파라미터(인자))
	public static void printCharater(char ch, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
//		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
//		printCharater('#', 10);
//		printCharater('?', 20);
//		printCharater('!', 30);
		
		int sum = add(10, 20);
		System.out.println(sum);
	}

}
