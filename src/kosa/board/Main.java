package kosa.board;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		while (true) {
			System.out.println("1. 글쓰기 2. 목록 조회 3. " + "수정 4. 삭제 5. 종료");
			System.out.print("메뉴: ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				m.addBoard();
				System.out.println("글 작성이 완료됐습니다.");
				break;
			case "2":
				m.listBoard();
				break;
			case "3":
				m.updateBoard();
				break;
			case "4":
				m.deleteBoard();
				break;
			case "5":
				System.out.println("프로그램 종료");
				return;
			}
		
		}

	}

}
