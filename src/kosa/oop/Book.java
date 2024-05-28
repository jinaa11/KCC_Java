package kosa.oop;

public class Book {
	// ����: å �̸�, ����, ���ε� ����
	// ���: ���ε� ���� ����, å ���� ���
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
		System.out.println(title + " ������ ������ " 
	+ price + "��, ���ε� ������ " + dc_price 
	+ "�� �Դϴ�.");
	}
}
