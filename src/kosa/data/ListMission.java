package kosa.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드로부터 문자열을 입력받아 처리하자.
		// 1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력(for, Iterator) 4. 종료
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String data = "";

		while (true) {
			System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료");
			System.out.print("메뉴: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.print("입력: ");
				data = sc.nextLine();
				list.add(data);
				break;
			case "2":
				System.out.print("삭제할 데이터: ");
				data = sc.nextLine();
				int index = list.indexOf(data);
				list.remove(index);
				break;
			case "3":
//				for (String x : list) {
//					System.out.println(x);
//				}
				Iterator<String> it = list.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}
