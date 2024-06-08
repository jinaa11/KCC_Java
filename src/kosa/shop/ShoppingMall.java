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

	// 고객 등록
	public void addCustomer() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("주소: ");
		String address = DataInput.sc.nextLine();
		System.out.print("휴대폰 번호: ");
		String phoneNo = DataInput.sc.nextLine();

		customer.add(new Customer(customerId++, name, address, phoneNo));

	}

	// 상품 등록
	public void addProduct() {
		System.out.print("상품명: ");
		String productName = DataInput.sc.nextLine();
		System.out.print("카테고리: ");
		String categoryName = DataInput.sc.nextLine();
		System.out.print("가격: ");
		int price = Integer.parseInt(DataInput.sc.nextLine());

		int existingCategoryId = -1;

		// 기존 카테고리 확인
		for (Category c : category) {
			if (categoryName.equals(c.getCategoryName())) {
				existingCategoryId = c.getCategoryId();
				break;
			}
		}

		// 카테고리가 존재하지 않으면 새로운 카테고리 추가
		if (existingCategoryId == -1) {
			existingCategoryId = categoryId++;
			category.add(new Category(existingCategoryId, categoryName));
		}

		product.add(new Product(existingCategoryId, categoryName, productId++, productName, price));

	}

	// 상품 카테고리별 목록 보기
	public void listCategory() {
		for (int i = 0; i < category.size(); i++) {
			System.out.println("===== 카테고리 (" + category.get(i).getCategoryName() + ") =====");
			for (int j = 0; j < product.size(); j++) {
				if (category.get(i).getCategoryName().equals(product.get(j).getCategoryName())) {
					product.get(j).show();
					System.out.println("-----------------------");
				}
			}
		}
	}

	// 상품 주문하기
	public void orderProduct() {
		System.out.print("주문자 이름: ");
		String customerName = DataInput.sc.nextLine();
		Customer orderCustomer = null;
		
		// 주문할 사람 이름과 일치하는 고객 정보 찾기
		for(Customer c : customer) {
			if(customerName.equals(c.getName())) {
				orderCustomer = c;
				c.show();
			}
		}
		
		if(orderCustomer == null) {
			System.out.println("존재하지 않는 고객입니다.");
			return;
		}
		
		System.out.print("주문할 상품: ");
		String orderProduct = DataInput.sc.nextLine();
		System.out.print("수량: ");
		int amount = Integer.parseInt(DataInput.sc.nextLine());
		
		for(int i = 0; i < product.size(); i++) {
			if(orderProduct.equals(product.get(i).getProductName())) {
				order.add(new Order(orderId++, orderCustomer, product.get(i), amount));
				System.out.println("주문이 성공적으로 추가되었습니다.");
				
			}
		}
		
		Iterator<Order> it = order.iterator();
		while(it.hasNext()) {
			it.next().show();
		}
	}
	
	// 개별 주문 목록 보기
	public void customerOrderList() {
		System.out.print("주문자명: ");
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
