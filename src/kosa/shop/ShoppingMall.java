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
		System.out.print("�̸�: ");
		String name = DataInput.sc.nextLine();
		System.out.print("�ּ�: ");
		String address = DataInput.sc.nextLine();
		System.out.print("�޴��� ��ȣ: ");
		String phoneNo = DataInput.sc.nextLine();

		customer.add(new Customer(customerId++, name, address, phoneNo));

		Iterator<Customer> it = customer.iterator();
		while (it.hasNext()) {
			it.next().show();
		}
	}

	public void addProduct() {
		System.out.print("��ǰ��: ");
		String productName = DataInput.sc.nextLine();
		System.out.print("ī�װ�: ");
		String categoryName = DataInput.sc.nextLine();
		System.out.print("����: ");
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
