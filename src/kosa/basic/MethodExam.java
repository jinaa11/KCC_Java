package kosa.basic;

public class MethodExam {

	// �޼��� ���� -> �ߺ� �ּ�ȭ, ���뼺
	// ���� ������, (static), ������(void), �޼��� �̸�(�Ķ����(����))
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
