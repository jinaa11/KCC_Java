package kosa.oop;

public class BookMain {

	public static void main(String[] args) {
		int total = 0;
		// �迭 �ȿ� ��ü�� ���� �� �ִ�.(������ ������ Ÿ���̸�)
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
		
		System.out.println("�� �ݾ�: " + total + "��");

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
