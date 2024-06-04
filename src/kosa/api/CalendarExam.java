package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
//		GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
//		System.out.println(gc);

		String now = gc.get(Calendar.YEAR) + "�� " 
					+ (gc.get(Calendar.MONTH) + 1) + "�� " 
					+ gc.get(Calendar.DATE) + "�� "
					+ gc.get(Calendar.HOUR) + "�� " 
					+ gc.get(Calendar.MINUTE) + "��";
		System.out.println("���� �ð�: " + now);

		gc.add(Calendar.DATE, 100); // ��¥�� �󸶳� ������ų ���ΰ�

		String future = gc.get(Calendar.YEAR) + "�� " 
						+ (gc.get(Calendar.MONTH) + 1)
						+ "�� " + gc.get(Calendar.DATE)
						+ "�� " + gc.get(Calendar.HOUR) + "�� "
						+ gc.get(Calendar.MINUTE) + "��";
		System.out.println("100�� ��: " + future);
		
		gc.set(2022, 5, 4); // ���ϴ� ��¥�� ����
		gc.add(Calendar.DATE, 1000);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // ��¥ ���� ����
		String str = sdf.format(gc.getTime()); // �ð� �� ��ȯ�ؼ� ��������
		System.out.println(str);
		
		// ����: 2024 ~ 2030����� �ڽ��� ������ ���� ����?
		// Calendar.DAY_OF_WEEK => ���� << ��(1) ��(2) ȭ(3) ��(4) ��(5) ��(6) ��(7)
		char week[] = {'��', '��', 'ȭ', '��', '��', '��', '��'};
		
		for(int i = 2024; i <= 2030; i++) {
			gc.set(i, 12, 1); // 6�� 4��
			char c = week[gc.get(Calendar.DAY_OF_WEEK) - 1];
			System.out.println(i + "���� ������ " + c + "�����Դϴ�.");
		}
	}

}
