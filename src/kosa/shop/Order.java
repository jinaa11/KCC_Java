package kosa.shop;

public class Order {
	private int id;
	private Customer customer;
	private Product product;
	private int amount;
	
	public Order() {}

	public Order(int id, Customer customer, Product product, int amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.product = product;
		this.amount = amount;
	}
	
	public void show() {
		System.out.println("주문 아이디: " + id);
		System.out.println("주문 수량: " + amount);
		System.out.println("고객 리스트: " + customer);
		System.out.println("상품 리스트: " + product);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
