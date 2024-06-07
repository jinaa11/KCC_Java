package kosa.shop;

public class Main {

	public static void main(String[] args) {
		ShoppingMall sm = new ShoppingMall();
		while (true) {
			System.out.println("1.고객 등록 2.상품 등록 3.상품 카테고리별 목록 보기 4.상품 주문하기 5.개별 주문 목록보기 6.종료하기");
			System.out.print("메뉴: ");
			String menu = DataInput.sc.nextLine();

			switch (menu) {
			case "1":
				sm.addCustomer();
				break;
			case "2":
				sm.addProduct();
				break;
			case "3":
				sm.listCategory();
				break;
			case "4":
				sm.orderProduct();
				break;
			case "5":

				break;
			case "6":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}
