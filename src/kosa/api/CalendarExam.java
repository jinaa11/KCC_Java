package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
//		GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
//		System.out.println(gc);

		String now = gc.get(Calendar.YEAR) + "년 " 
					+ (gc.get(Calendar.MONTH) + 1) + "월 " 
					+ gc.get(Calendar.DATE) + "일 "
					+ gc.get(Calendar.HOUR) + "시 " 
					+ gc.get(Calendar.MINUTE) + "분";
		System.out.println("현재 시간: " + now);

		gc.add(Calendar.DATE, 100); // 날짜를 얼마나 증가시킬 것인가

		String future = gc.get(Calendar.YEAR) + "년 " 
						+ (gc.get(Calendar.MONTH) + 1)
						+ "월 " + gc.get(Calendar.DATE)
						+ "일 " + gc.get(Calendar.HOUR) + "시 "
						+ gc.get(Calendar.MINUTE) + "분";
		System.out.println("100일 후: " + future);
		
		gc.set(2022, 5, 4); // 원하는 날짜로 지정
		gc.add(Calendar.DATE, 1000);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // 날짜 포맷 지정
		String str = sdf.format(gc.getTime()); // 시간 형 변환해서 가져오기
		System.out.println(str);
		
		// 퀴즈: 2024 ~ 2030년까지 자신의 생일이 무슨 요일?
		// Calendar.DAY_OF_WEEK => 요일 << 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
		char week[] = {'일', '월', '화', '수', '목', '금', '토'};
		
		for(int i = 2024; i <= 2030; i++) {
			gc.set(i, 12, 1); // 6월 4일
			char c = week[gc.get(Calendar.DAY_OF_WEEK) - 1];
			System.out.println(i + "년의 생일은 " + c + "요일입니다.");
		}
	}

}
