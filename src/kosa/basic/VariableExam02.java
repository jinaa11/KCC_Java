package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {
		// Ű����κ��� ������ �Է�
		Scanner sc = new Scanner(System.in); // in: inputStream
		
//		System.out.print("���� �Է�: ");
		// enter Ű ó�� ��� 1
//		int num= Integer.parseInt(sc.nextLine()); // nextLine()�� ���������� ��ȯ
		
		// enter Ű ó�� ��� 2
		// int num = sc.nextInt(); // 10 + enter
		// sc.nextLine(); // ���� ���� �Է¹ް� ���ڿ� �Է¹��� �� 
		
//		System.out.print("���ڿ� �Է�: ");
//		String str = sc.nextLine();
//		
//		System.out.println(num);
//		System.out.println(str);
		
		// int <==> char
		char ch = 'A';
		System.out.println((int)ch);
		
		// A~Z for �� �̿��Ͽ� ��ü ���
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
		String num5 =String.valueOf(num4); // ������ ���ڿ��� ����
		String num6 = num4 + ""; // ���ڿ� > ������, int�� String ĳ����
		
		String str = 7 + "7" + 7; 
		System.out.println(str);
	}

}
