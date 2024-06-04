package kosa.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		// 1. String ��ü ���� ����� ������
		String str = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");

		if (str == str3) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}

		// 2. String Ŭ���� �Һ��� Ư¡: String Ŭ������ ��� �޼ҵ嵵 �ڱ� �ڽ��� ������ �� ����. return�� �뵵
		// StringBuffer, StringBuilder(������)
		String str4 = str.concat("DEF");
		System.out.println(str4);

		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		System.out.println(sb);

		// ������(+) ���� ����
		String sql = "select * from board ";
		int num = 10;

		if (num == 10) {
			sql += "where num = 10";
		}

		System.out.println(sql);

		// �ش� ���ڿ��� ��ġ�� �ľ� => indexOf("���ڿ�") => �ش� ���ڿ��� �ε���, ������ -1
		System.out.println(sql.indexOf("$"));

		// ���ڿ� ����
		System.out.println(sql.length());

		for (int i = 0; i < sql.length(); i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println();

		// ���ڿ� �κ� ����: subString(5), subString(5, 10)
		// ����: sql ���� "board" ���ڿ��� ���
		int index = sql.indexOf("board");
		System.out.println(sql.substring(index, index + 5));
		
		// ����
		String fileName = "kosa.jpg";
		String head = "";
		String pattern = "";
		
		index = fileName.indexOf(".");
		head = fileName.substring(0, index);
		pattern = fileName.substring(index + 1);
		
		System.out.println(head + " : " + pattern);
		
		String id = "kosa";
		String m_id = "Kosa ";
		
		if(id.equalsIgnoreCase(m_id.trim())) { // trim(): ���� ����
			System.out.println("����.");
		} else {
			System.out.println("�ٸ���.");
		}
		
		// ���ڿ� => String[] ��ȯ
		String fruits = "���, ����, ����, ��";
		String arr[] = fruits.split(",");
		System.out.println(Arrays.toString(arr));
		
		// ���ڿ� => char[] ��ȯ
		String str5 = "abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		// ���ڿ� => byte[] ��ȯ
		String str6 = "abcdef";
		byte arr3[] = str.getBytes();
		System.out.println(Arrays.toString(arr3));
		
		// ���ڿ� <==> ������
		String str7 = "100";
		int num2 = 0;
		num2 = Integer.parseInt(str7);
		System.out.println(num2);
		
		int num3 = 10;
//		String str8 = String.valueOf(num3); // �������� ���ڿ���
		String str8 = 10 + "";
		System.out.println(str8);
		
	}
}
