package kosa.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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
		System.out.print("����: ");
		int age = Integer.parseInt(DataInput.sc.nextLine());
		System.out.print("�ּ�: ");
		String address = DataInput.sc.nextLine();
		System.out.print("�޴��� ��ȣ(��.010-1111-2222): ");
		String phoneNo = DataInput.sc.nextLine();
		
		// phoneNo ���� ǥ����
		String pattern = "010-\\d{4}-\\d{4}";
		
		if(phoneNo.matches(pattern) ) {
			customer.add(new Customer(customerId++, name, age, address, phoneNo));
			System.out.println("�� ����� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�޴��� ��ȣ�� ���� ���Ŀ� ���� �ʽ��ϴ�.");
		}
		
		

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
//		for (Category c : category) {
//			if (categoryName.equals(c.getCategoryName())) {
//				existingCategoryId = c.getCategoryId();
//				break;
//			}
//		}
		
		Category cate = category.stream()
				.filter(c1 -> categoryName.equals(c1.getCategoryName()))
				.findFirst().orElseThrow();

		// ī�װ��� �������� ������ ���ο� ī�װ� �߰�
		if (existingCategoryId == -1) {
			existingCategoryId = categoryId++;
			category.add(new Category(existingCategoryId, categoryName));
		}

		product.add(new Product(existingCategoryId, categoryName, productId++, productName, price));
		System.out.println("��ǰ ����� �Ϸ�Ǿ����ϴ�.");

	}

	// ��ǰ ī�װ��� ��� ����
	public void listCategory() {
		Collections.sort(category);
		
		for (int i = 0; i < category.size(); i++) {
			System.out.println("========================= ī�װ� (" + category.get(i).getCategoryName() + ") =========================");
			for (int j = 0; j < product.size(); j++) {
				if (category.get(i).getCategoryName().equals(product.get(j).getCategoryName())) {
					product.get(j).show();
					System.out.println("---------------------------------------------------------------");
				}
			}
		}
		
	}

	// ��ǰ �ֹ��ϱ�
	public void orderProduct() throws Exception {
		System.out.print("�ֹ��� �̸�: ");
		String customerName = DataInput.sc.nextLine();
		Customer orderCustomer = null;
		
		// �ֹ��� ��� �̸��� ��ġ�ϴ� �� ���� ã��
//		for(Customer c : customer) {
//			if(customerName.equals(c.getName())) {
//				orderCustomer = c;
//			}
//		}
//		
//		if(orderCustomer == null) {
//			System.out.println("�������� �ʴ� ���Դϴ�.");
//			return;
//		}
		
		orderCustomer = customer.stream()
				.filter(c1 -> customerName.equals(c1.getName()))
				.findFirst().orElseThrow(() -> new Exception("�������� �ʴ� ���Դϴ�."));
		
		System.out.print("�ֹ��� ��ǰ: ");
		String orderProduct = DataInput.sc.nextLine();
		System.out.print("����: ");
		int amount = Integer.parseInt(DataInput.sc.nextLine());
		
//		boolean isFindProduct = false;
		
//		for(Product p : product) {
//			if(orderProduct.equals(p.getProductName())) {
//				order.add(new Order(orderId++, orderCustomer, p, amount));
//				System.out.println("�ֹ��� ���������� �߰��Ǿ����ϴ�.");
//				isFindProduct = true;
//				break;
//			}
//		}
		
		Product p = product.stream()
			.filter(p1 -> orderProduct.equals(p1.getProductName()))
			.findFirst().orElseThrow(() -> new Exception("�������� �ʴ� ��ǰ�Դϴ�."));
		
		order.add(new Order(orderId++, orderCustomer, p, amount));
		
//		if(op.isPresent()) {
//			Product p = op.get();
//			order.add(new Order(orderId++, orderCustomer, p, amount));
//			isFindProduct = true;
//		}
		
//		if(!isFindProduct) {
//			System.out.println("�������� �ʴ� ��ǰ�Դϴ�.");
//		}
	}
	
	// ���� �ֹ� ��� ����
	public void customerOrderList() {
		System.out.print("�ֹ��ڸ�: ");
		String orderName = DataInput.sc.nextLine();
		
		for(int i = 0; i < order.size(); i++) {
			if(orderName.equals(order.get(i).getCustomer().getName())) {
				order.get(i).show();
				System.out.println("-------------------------------------------------------------------------");
			}
		}	
	}
	
	public void totalSales() {
		int totalSales = 0;
		for(Order o : order) {
			totalSales += o.getAmount() * o.getProduct().getPrice();
		}
		System.out.println("�� ������� " + totalSales + "�� �Դϴ�.");
	}
}
