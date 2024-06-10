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

	// 고객 등록
	public void addCustomer() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("나이: ");
		int age = Integer.parseInt(DataInput.sc.nextLine());
		System.out.print("주소: ");
		String address = DataInput.sc.nextLine();
		System.out.print("휴대폰 번호(예.010-1111-2222): ");
		String phoneNo = DataInput.sc.nextLine();
		
		// phoneNo 정규 표현식
		String pattern = "010-\\d{4}-\\d{4}";
		
		if(phoneNo.matches(pattern) ) {
			customer.add(new Customer(customerId++, name, age, address, phoneNo));
			System.out.println("고객 등록이 완료되었습니다.");
		} else {
			System.out.println("휴대폰 번호가 지정 형식에 맞지 않습니다.");
		}
		
		

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
//		for (Category c : category) {
//			if (categoryName.equals(c.getCategoryName())) {
//				existingCategoryId = c.getCategoryId();
//				break;
//			}
//		}
		
		Category cate = category.stream()
				.filter(c1 -> categoryName.equals(c1.getCategoryName()))
				.findFirst().orElseThrow();

		// 카테고리가 존재하지 않으면 새로운 카테고리 추가
		if (existingCategoryId == -1) {
			existingCategoryId = categoryId++;
			category.add(new Category(existingCategoryId, categoryName));
		}

		product.add(new Product(existingCategoryId, categoryName, productId++, productName, price));
		System.out.println("상품 등록이 완료되었습니다.");

	}

	// 상품 카테고리별 목록 보기
	public void listCategory() {
		Collections.sort(category);
		
		for (int i = 0; i < category.size(); i++) {
			System.out.println("========================= 카테고리 (" + category.get(i).getCategoryName() + ") =========================");
			for (int j = 0; j < product.size(); j++) {
				if (category.get(i).getCategoryName().equals(product.get(j).getCategoryName())) {
					product.get(j).show();
					System.out.println("---------------------------------------------------------------");
				}
			}
		}
		
	}

	// 상품 주문하기
	public void orderProduct() throws Exception {
		System.out.print("주문자 이름: ");
		String customerName = DataInput.sc.nextLine();
		Customer orderCustomer = null;
		
		// 주문할 사람 이름과 일치하는 고객 정보 찾기
//		for(Customer c : customer) {
//			if(customerName.equals(c.getName())) {
//				orderCustomer = c;
//			}
//		}
//		
//		if(orderCustomer == null) {
//			System.out.println("존재하지 않는 고객입니다.");
//			return;
//		}
		
		orderCustomer = customer.stream()
				.filter(c1 -> customerName.equals(c1.getName()))
				.findFirst().orElseThrow(() -> new Exception("존재하지 않는 고객입니다."));
		
		System.out.print("주문할 상품: ");
		String orderProduct = DataInput.sc.nextLine();
		System.out.print("수량: ");
		int amount = Integer.parseInt(DataInput.sc.nextLine());
		
//		boolean isFindProduct = false;
		
//		for(Product p : product) {
//			if(orderProduct.equals(p.getProductName())) {
//				order.add(new Order(orderId++, orderCustomer, p, amount));
//				System.out.println("주문이 성공적으로 추가되었습니다.");
//				isFindProduct = true;
//				break;
//			}
//		}
		
		Product p = product.stream()
			.filter(p1 -> orderProduct.equals(p1.getProductName()))
			.findFirst().orElseThrow(() -> new Exception("존재하지 않는 상품입니다."));
		
		order.add(new Order(orderId++, orderCustomer, p, amount));
		
//		if(op.isPresent()) {
//			Product p = op.get();
//			order.add(new Order(orderId++, orderCustomer, p, amount));
//			isFindProduct = true;
//		}
		
//		if(!isFindProduct) {
//			System.out.println("존재하지 않는 상품입니다.");
//		}
	}
	
	// 개별 주문 목록 보기
	public void customerOrderList() {
		System.out.print("주문자명: ");
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
		System.out.println("총 매출액은 " + totalSales + "원 입니다.");
	}
}
