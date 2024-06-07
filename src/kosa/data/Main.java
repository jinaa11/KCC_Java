package kosa.data;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Order o = new Order();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.주문 요청 2.주문 처리 3.매출액 총액 4.종료");
			System.out.print("메뉴: ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				o.addOrder();
				break;
			case "2":
				o.showOrder();
				break;
			case "3":
				
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			}
		}
		

	}

}
