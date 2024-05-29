package kosa.board;

import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);
	Board arr[] = new Board[10];
	int cnt;

	public Manager() {
	}

	public void addBoard() {
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("내용: ");
		String content = sc.nextLine();

		arr[cnt++] = new Board(cnt, title, content);
	}

	public void listBoard() {
		for (int i = 0; i < cnt; i++) {
			if (arr[i] != null) {
				arr[i].print();
			}
		}
	}

	public void updateBoard() {
		System.out.print("수정할 글 번호: ");
//		int num = Integer.parseInt(sc.nextLine());
		int num = sc.nextInt(); // 정수 + 공백
		sc.nextLine(); // 공백 제거

		for (int i = 0; i < cnt; i++) {
			if (arr != null && num == arr[i].getNum()) {
				System.out.print("제목: ");
				String title = sc.nextLine();
				System.out.print("내용: ");
				String content = sc.nextLine();

				arr[i].setTitle(title);
				arr[i].setContent(content);
			}
		}
		System.out.println(num + "번 게시글을 수정하였습니다.");
	}

	public void deleteBoard() {
		System.out.print("삭제할 글 번호: ");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cnt; i++) {
			if (arr[i] != null && num == arr[i].getNum()) {
				arr[i] = null;
				System.out.println(num + "번 글이 삭제됐습니다.");
			}
		}
	}

}
