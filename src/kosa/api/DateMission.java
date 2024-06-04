package kosa.api;

import java.util.Calendar;
import java.util.Scanner;

public class DateMission {

	public static void main(String[] args) {
		// 키보드 => 날짜 입력 2014/06/04
		// 입사일 입력 받아 => 몇 년 몇 개월 재직 중(현 날짜와 이전 날짜의 차이)
		Scanner sc = new Scanner(System.in);
		Calendar gc = Calendar.getInstance();
		
		String employee_date = sc.nextLine();
		String arr[] = employee_date.split("/");

		int year = gc.get(Calendar.YEAR) - Integer.parseInt(arr[0]);
		int month = gc.get(Calendar.MONTH) + 1 - Integer.parseInt(arr[1]);

		System.out.println(year + "년 " + Math.abs(month) + "개월 재직 중");
	}

}
