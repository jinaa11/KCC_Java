package kosa.api;

import java.util.Calendar;
import java.util.Scanner;

public class DateMission {

	public static void main(String[] args) {
		// Ű���� => ��¥ �Է� 2014/06/04
		// �Ի��� �Է� �޾� => �� �� �� ���� ���� ��(�� ��¥�� ���� ��¥�� ����)
		Scanner sc = new Scanner(System.in);
		Calendar gc = Calendar.getInstance();
		
		String employee_date = sc.nextLine();
		String arr[] = employee_date.split("/");

		int year = gc.get(Calendar.YEAR) - Integer.parseInt(arr[0]);
		int month = gc.get(Calendar.MONTH) + 1 - Integer.parseInt(arr[1]);

		System.out.println(year + "�� " + Math.abs(month) + "���� ���� ��");
	}

}
