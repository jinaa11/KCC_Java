package kosa.api;

import java.util.Calendar;

public class CalendarExam02 {

	public static void main(String[] args) {
		// 2024�� 6�� �޷� �����
		// <2024�� 6��>
		// �� �� ȭ �� �� �� ��
		//              1
		//  2 3 4 5 6 7 8
		Calendar gc = Calendar.getInstance();
		int n = gc.getActualMaximum(Calendar.DATE); // ���� ��¥ ���� ����
		System.out.println("<2024�� 6��>");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
				
		gc.set(2024, 5, 1);
		int week = gc.get(Calendar.DAY_OF_WEEK);
		for(int i = 1; i < week; i++) {
			System.out.println("\t");
		}
		for(int i = 1; i <= n; i++) {
			System.out.print(i + "\t");
			if((week + i - 1) % 7 == 0) {
				System.out.println();
			}
		}
		
	}

}
