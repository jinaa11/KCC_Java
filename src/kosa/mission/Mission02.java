package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// ���� ���� ����
		// ����, ����, ���� ������ Ű����κ��� �Է� �ް�
		// ������ ����� ����ϼ���.(�� ����� �Ǽ���)
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		
		System.out.print("���� ����: ");
		kor = sc.nextInt();
		System.out.print("���� ����: ");
		eng = sc.nextInt();
		System.out.print("���� ����: ");
		math = sc.nextInt();

		int total = kor + eng + math;
//		double avg = total / 3.0; // total / 3 -> ���� / ����, ���� 3.0���� ������� �Ǽ��� ����
		int avg = (int)(total/3.0); // ��ü�� int�� ĳ����, ���� ��ü�� ��ȣ�ؾ� �� 
		System.out.println("����: " + total);
		System.out.println("���: " + avg);
	}

}
