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
		System.out.println("�ֹ� ���̵�: " + id);
		System.out.println("�ֹ� ����: " + amount);
		System.out.println("�� ����Ʈ: " + customer);
		System.out.println("��ǰ ����Ʈ: " + product);
		
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
