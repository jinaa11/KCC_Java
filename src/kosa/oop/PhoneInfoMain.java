package kosa.oop;

import java.util.Scanner;

public class PhoneInfoMain {

	public static void main(String[] args) {
		PhoneInfo pi = new PhoneInfo();
		while (true) {
			System.out.println("1.추가 2.전체출력 3.검색 4.종료");
			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴: ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				pi.addPhoneInfo();
				System.out.println("전화번호가 등록되었습니다.\n");
				break;
			case 2:
				pi.listPhoneInfo();
				break;
			case 3:
				System.out.print("검색할 이름: ");
				String searchName = sc.next();
				pi.searchPhoneInfo(searchName);
				
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

}
