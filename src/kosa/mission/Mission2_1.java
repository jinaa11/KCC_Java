package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {
	
//	public static int totalScore(int score[]) {
//		int sum = 0;
//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		return sum;
//	}
//	
//	public static double avgScore(int score[]) {
//		int total = totalScore(score);
//		double avg = total/3.0;
//		
//		return avg;
//	}
	
	public static void average(int arr[]) {
		arr[4] = arr[3] / 3;
	}

	public static void main(String[] args) {
		// ����, ����, ���� => Ű����� �Է� �޾� �迭�� ��������
		// ����, ��� ���ϱ� => �޼���� �����Ͽ� ����
		Scanner sc = new Scanner(System.in);
		String subject[] = {"����", "����", "����"};
		int arr[] = new int[5];
		
		for(int i = 0; i < 3; i++) {
			System.out.print(subject[i] + "�Է�: ");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
		}
		
		average(arr);
		
		System.out.println("����\t����\t����\t����\t���");
		for(int n : arr) {
			System.out.print(n + "\t");
		}
//		int kor, eng, math;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� ����: ");
//		kor = sc.nextInt();
//		System.out.print("���� ����: ");
//		eng = sc.nextInt();
//		System.out.print("���� ����: ");
//		math = sc.nextInt();
//		
//		int score[] = {kor, eng, math};
//		int total = totalScore(score);
//		double avg = avgScore(score);
//		
//		System.out.println("����, ����, ���� ����: " + total + "��");
//		System.out.println("����, ����, ���� ���: " + avg + "��");
		
	}

}
