package kosa.shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingMall {
	List<Customer> customer;
	List<Product> product;
	List<Category> category;
	List<Order> order;

	int customerId = 1;
	int productId = 1;
	int categoryId = 1;
	int orderId = 1;

	public ShoppingMall() {
		customer = new ArrayList<Customer>();
		product = new ArrayList<Product>();
		category = new ArrayList<Category>();
		order = new ArrayList<Order>();
	}

	// �� ���
	public void addCustomer() {
		System.out.print("�̸�: ");
		String name = DataInput.sc.nextLine();
		System.out.print("�ּ�: ");
		String address = DataInput.sc.nextLine();
		System.out.print("�޴��� ��ȣ: ");
		String phoneNo = DataInput.sc.nextLine();

		customer.add(new Customer(customerId++, name, address, phoneNo));

	}

	// ��ǰ ���
	public void addProduct() {
		System.out.print("��ǰ��: ");
		String productName = DataInput.sc.nextLine();
		System.out.print("ī�װ�: ");
		String categoryName = DataInput.sc.nextLine();
		System.out.print("����: ");
		int price = Integer.parseInt(DataInput.sc.nextLine());

		int existingCategoryId = -1;

		// ���� ī�װ� Ȯ��
		for (Category c : category) {
			if (categoryName.equals(c.getCategoryName())) {
				existingCategoryId = c.getCategoryId();
				break;
			}
		}

		// ī�װ��� �������� ������ ���ο� ī�װ� �߰�
		if (existingCategoryId == -1) {
			existingCategoryId = categoryId++;
			category.add(new Category(existingCategoryId, categoryName));
		}

		product.add(new Product(existingCategoryId, categoryName, productId++, productName, price));

	}

	// ��ǰ ī�װ��� ��� ����
	public void listCategory() {
		for (int i = 0; i < category.size(); i++) {
			System.out.println("===== ī�װ� (" + category.get(i).getCategoryName() + ") =====");
			for (int j = 0; j < product.size(); j++) {
				if (category.get(i).getCategoryName().equals(product.get(j).getCategoryName())) {
					product.get(j).show();
					System.out.println("-----------------------");
				}
			}
		}
	}

	// ��ǰ �ֹ��ϱ�
	public void orderProduct() {
		System.out.print("�ֹ��� �̸�: ");
		String customerName = DataInput.sc.nextLine();
		Customer orderCustomer = null;
		
		// �ֹ��� ��� �̸��� ��ġ�ϴ� �� ���� ã��
		for(Customer c : customer) {
			if(customerName.equals(c.getName())) {
				orderCustomer = c;
				c.show();
			}
		}
		
		if(orderCustomer == null) {
			System.out.println("�������� �ʴ� ���Դϴ�.");
			return;
		}
		
		System.out.print("�ֹ��� ��ǰ: ");
		String orderProduct = DataInput.sc.nextLine();
		System.out.print("����: ");
		int amount = Integer.parseInt(DataInput.sc.nextLine());
		
		for(int i = 0; i < product.size(); i++) {
			if(orderProduct.equals(product.get(i).getProductName())) {
				order.add(new Order(orderId++, orderCustomer, product.get(i), amount));
				System.out.println("�ֹ��� ���������� �߰��Ǿ����ϴ�.");
				
			}
		}
		
		Iterator<Order> it = order.iterator();
		while(it.hasNext()) {
			it.next().show();
		}
	}
	
	// ���� �ֹ� ��� ����
	public void customerOrderList() {
		System.out.print("�ֹ��ڸ�: ");
		String orderName = DataInput.sc.nextLine();
		
//		Iterator<Order> it = order.iterator();
//		while(it.hasNext()) {
//			if(orderName.equals(it.next().getCustomer().getName())) {
//				it.next().show();
//			}
//		}
		
		for(int i = 0; i < order.size(); i++) {
			if(orderName.equals(order.get(i).getCustomer().getName())) {
				order.get(i).show();
			}
		}
		
		
	}
}
