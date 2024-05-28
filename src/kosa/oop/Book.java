package kosa.oop;

public class Book {
	// 상태: 책 이름, 정가, 할인된 가격
	// 기능: 할인된 가격 산출, 책 정보 출력
	String title;
	int price;
	int dc_price;

	public Book() {
	}

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public void discount() {
		if (price >= 30000) {
			dc_price = (int) (price * 0.75);
		} else if (price >= 20000) {
			dc_price = (int) (price * 0.8);
		} else if(price >= 15000) {
			dc_price = (int) (price * 0.85);
		}
	}

	public void printBook() {
		System.out.println(title + " 교재의 정가는 " 
	+ price + "원, 할인된 가격은 " + dc_price 
	+ "원 입니다.");
	}
}
