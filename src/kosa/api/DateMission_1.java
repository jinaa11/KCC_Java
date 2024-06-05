package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateMission_1 {

	public static void main(String[] args) {
		// Ű���� => ��¥ �Է� 2014/05/05
		// �Ի��� �Է� �޾� => �� �� �� ���� ���� ��(�� ��¥�� ���� ��¥�� ����)
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		Date inDate = null;

		while (sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}

		Calendar cal = Calendar.getInstance(); // �Ի���
		cal.setTime(inDate); // 2014

		Calendar today = Calendar.getInstance(); // ���� ��¥ 2024

		// ���ϼ�
		long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (24 * 60 * 60 * 1000); // ���� �Ⱓ
		System.out.println(day);

		int year = (int) (day / 365);
		// ���� ����ϱ�
		int month = (int) (day % 365) % 12;
		
		System.out.println("���� �Ⱓ: " + year + "�� " + month +"���� �ټ�");
	}

}
