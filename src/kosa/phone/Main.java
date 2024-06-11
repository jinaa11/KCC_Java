package kosa.phone;

import java.util.Scanner;

// 프로그램의 흐름
public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();

		// 만약 while문 안에서 Manager 객체를 생성하면 배열이 계속적으로 생겨서 어느 배열에 있는지 구분하기 어려움
		// 3. 검색 추가 - 이름
		while (true) {
			System.out.println("1.추가 2.전체출력 3.검색 4.수정 5.삭제 6.정렬 7.데이터 저장 8.데이터 불러오기 9.종료");
			System.out.print("메뉴 입력: ");
			String menu = DataInput.sc.nextLine();

			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				try {
					m.searchPhoneInfo();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "4":
				try {
					m.updatePhoneInfo();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "5":
				try {
					m.deletePhoneInfo();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "6":
				m.sortPhoneInfo();
				break;
			case "7":
				m.writePhoneInfo();
				break;
			case "8":
				m.readPhoneInfo();
				break;
			case "9":
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

}
