package kosa.oop;

public class BookMain {

	public static void main(String[] args) {
		int total = 0;
		// 배열 안에 객체를 넣을 수 있다.(동일한 데이터 타입이면)
		Book arr[] = { 
				new Book("JAVA", 30000),
				new Book("JSP", 20000),
				new Book("Oracle", 15000)
		};
		
		for(Book b : arr) {
			b.discount();
			b.printBook();
			total += b.dc_price;
		}
		
		System.out.println("총 금액: " + total + "원");

//		Book b1 = new Book("JAVA", 30000);
//		b1.discount();
//		b1.printBook();
//
//		Book b2 = new Book("JSP", 20000);
//		b2.discount();
//		b2.printBook();
//
//		Book b3 = new Book("Oracle", 15000);
//		b3.discount();
//		b3.printBook();

	}

}
