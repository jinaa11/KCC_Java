package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateMission_1 {

	public static void main(String[] args) {
		// 키보드 => 날짜 입력 2014/05/05
		// 입사일 입력 받아 => 몇 년 몇 개월 재직 중(현 날짜와 이전 날짜의 차이)
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		Date inDate = null;

		while (sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요.");
			}
		}

		Calendar cal = Calendar.getInstance(); // 입사일
		cal.setTime(inDate); // 2014

		Calendar today = Calendar.getInstance(); // 오늘 날짜 2024

		// 총일수
		long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (24 * 60 * 60 * 1000); // 재직 기간
		System.out.println(day);

		int year = (int) (day / 365);
		// 각자 계산하기
		int month = (int) (day % 365) % 12;
		
		System.out.println("재직 기간: " + year + "년 " + month +"개월 근속");
	}

}
