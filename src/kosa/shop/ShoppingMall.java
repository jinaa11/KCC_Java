package kosa.shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingMall {
	List<Customer> customer;
	List<Product> product;
	int customerId = 1;
	int productId = 1;
	int categoryId = 1;

	public ShoppingMall() {
		customer = new ArrayList<Customer>();
		product = new ArrayList<Product>();
	}

	public void addCustomer() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("주소: ");
		String address = DataInput.sc.nextLine();
		System.out.print("휴대폰 번호: ");
		String phoneNo = DataInput.sc.nextLine();

		customer.add(new Customer(customerId++, name, address, phoneNo));

		Iterator<Customer> it = customer.iterator();
		while (it.hasNext()) {
			it.next().show();
		}
	}

	public void addProduct() {
		System.out.print("상품명: ");
		String productName = DataInput.sc.nextLine();
		System.out.print("카테고리: ");
		String categoryName = DataInput.sc.nextLine();
		System.out.print("가격: ");
		int price = Integer.parseInt(DataInput.sc.nextLine());

		product.add(new Product(categoryId++, categoryName, productId++, productName, price));

		Iterator<Product> it = product.iterator();
		while (it.hasNext()) {
			it.next().show();
		}
	}

	public void listCategory() {

	}
}
