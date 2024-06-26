package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// 성적 관리 구현
		// 국어, 영어, 수학 점수를 키보드로부터 입력 받고
		// 총점과 평균을 출력하세요.(단 평균은 실수형)
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;

		System.out.print("국어 점수: ");
		kor = sc.nextInt();
		System.out.print("영어 점수: ");
		eng = sc.nextInt();
		System.out.print("수학 점수: ");
		math = sc.nextInt();

		int total = kor + eng + math;
//		double avg = total / 3.0; // total / 3 -> 정수 / 정수, 따라서 3.0으로 나눠줘야 실수형 가능
		int avg = (int) (total / 3.0); // 전체를 int로 캐스팅, 따라서 전체를 괄호해야 함
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);

		// 학점 90이상 => A학점
		// 80이상 => B학점
		// 70이상 => C학점
		// 60이상 => D학점
		// 60이하 => F학점

		if (avg >= 90) {
			System.out.println("A학점");
		} else if (avg >= 80) {
			System.out.println("B학점");
		} else if (avg >= 70) {
			System.out.println("C학점");
		} else if (avg >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}
}
