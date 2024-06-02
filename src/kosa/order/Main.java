package kosa.order;

public class Main {

	public static void main(String[] args) {
		Order o = new Order();
		
		while (true) {
			System.out.println("1.주문 추가 2.삭제 3.결제 4.총매출 합계 5.종료");
			System.out.print("메뉴: ");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			// 주문 추가
			case "1":
				o.addMenu();
				break;
			// 삭제
			case "2":

				break;
			// 결제
			case "3":

				break;
			// 총매출 합계
			case "4":

				break;
			case "5":
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

}
