package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// ���ڿ� ��
//		String a = "abc";
//		String b = "abc";
//		
//		if(a.equals(b)) {
//			System.out.println("����.");
//		} else {
//			System.out.println("�ٸ���.");
//		}
		// �� ������ ������ ���ڿ��� �Է� �޾�
		// ��Ģ���� ����� ����Ͻÿ�.(����)
		// ex> ����1: 10
		//     ����2: 20
		//     ������: +
		// ���> 30
		Scanner sc = new Scanner(System.in);
		System.out.print("����1: ");
		int num1 = sc.nextInt();
		System.out.print("����2: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������: ");
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
		
		System.out.println("���: " + result);
	}

}
