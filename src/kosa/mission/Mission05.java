package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 메뉴를 선택해서 해당 메뉴를 명령문을 실행해 보자.
		// 1. 추가 2. 출력 3. 검색 4. 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
		System.out.print("메뉴 선택: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("메뉴가 추가되었습니다.");
			break;
		case 2:
			System.out.println("메뉴가 출력되었습니다.");
			break;
		case 3:
			System.out.println("검색하신 메뉴입니다.");
			break;
		case 4:
			System.out.println("종료되었습니다.");
			return;
		}

	}

}
