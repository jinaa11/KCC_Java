package kosa.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission_1 {

	public static void main(String[] args) {
		// List 자료구조를 활용하여 키보드로부터 문자열을 입력받아 처리하자.
		// 1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력(for, Iterator) 4. 종료
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<String>();
		int idx = 0;
		
		while(true) {
			System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료");
			System.out.print("메뉴: ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				System.out.print("추가: ");
				list.add(sc.nextLine());
				break;
			case "2":
				System.out.print("삭제: ");
				idx = list.indexOf(sc.nextLine());
				if(idx != -1) {
					list.remove(idx);
				} else {
					System.out.println("존재하지 않습니다.");
				}
				break;
			case "3":
//				for(int i = 0; i < list.size(); i++) {
//					System.out.print(list.get(i) + ", ");
//				}
				Iterator<String> iter = list.iterator();
				
				while(iter.hasNext()) { // 다음 데이터 있는지
					System.out.println(iter.next()); // iterator를 통해 데이터를 하나씩 꺼냄
				}
				
				System.out.println();
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}
