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
		int avg = (int) (total / 3.0); // ��ü�� int�� ĳ����, ���� ��ü�� ��ȣ�ؾ� ��
		System.out.println("����: " + total);
		System.out.println("���: " + avg);

		// ���� 90�̻� => A����
		// 80�̻� => B����
		// 70�̻� => C����
		// 60�̻� => D����
		// 60���� => F����

		if (avg >= 90) {
			System.out.println("A����");
		} else if (avg >= 80) {
			System.out.println("B����");
		} else if (avg >= 70) {
			System.out.println("C����");
		} else if (avg >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}
	}
}
