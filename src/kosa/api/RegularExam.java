package kosa.api;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		String str = sc.nextLine();
		
		// abc ���� ���� ���� üũ: 
//		if(str.matches(".*abc.*")) { // abc ���ڸ� ������ ��
//			System.out.println("��Ī");
//		} else {
//			System.out.println("���Ī");
//		}
		
		// ���ڸ� 3�ڸ� ���� �Ǵ� => \\ �������� 2���� 
//		if(str.matches("[\\d]{3}")) { 
//			System.out.println("��Ī");
//		} else {
//			System.out.println("���Ī");
//		}
		
		// ���ĺ�, ���ڸ� 5�ڸ� �̻�
//		if(str.matches("[\\w]{5,}")) { 
//			System.out.println("��Ī");
//		} else {
//			System.out.println("���Ī");
//		}
		
		// �ѱ� 3~5
//		if(str.matches("[��-�R]{3,5}")) { // abc ���ڸ� ������ ��
//			System.out.println("��Ī");
//		} else {
//			System.out.println("���Ī");
//		}
		
		// �̸��� ����
		// jan2047@naver.com => ��Ī
		// 123jan2047@naver.com => ���Ī
		// jan2047naver.com => ���Ī
		// jan2047@naver.comcom => ���Ī
		if(str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")) { // abc ���ڸ� ������ ��
			System.out.println("��Ī");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		} else {
			System.out.println("���Ī");
		}
	}

}
