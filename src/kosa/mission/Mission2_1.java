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
		// 국어, 영어, 수학 => 키보드로 입력 받아 배열로 구현하자
		// 총점, 평균 구하기 => 메서드로 정의하여 구현
		Scanner sc = new Scanner(System.in);
		String subject[] = {"국어", "영어", "수학"};
		int arr[] = new int[5];
		
		for(int i = 0; i < 3; i++) {
			System.out.print(subject[i] + "입력: ");
			arr[i] = sc.nextInt();
			arr[3] += arr[i];
		}
		
		average(arr);
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int n : arr) {
			System.out.print(n + "\t");
		}
//		int kor, eng, math;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어 성적: ");
//		kor = sc.nextInt();
//		System.out.print("영어 성적: ");
//		eng = sc.nextInt();
//		System.out.print("수학 성적: ");
//		math = sc.nextInt();
//		
//		int score[] = {kor, eng, math};
//		int total = totalScore(score);
//		double avg = avgScore(score);
//		
//		System.out.println("국어, 영어, 수학 총점: " + total + "점");
//		System.out.println("국어, 영어, 수학 평균: " + avg + "점");
		
	}

}
