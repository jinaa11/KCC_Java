package kosa.shop;

public class Product extends Category {
	private int productId;
	private String productName;
	private int price;

	public Product() {
	}

	public Product(int categoryId, String categoryName, int productId, String productName, int price) {
		super(categoryId, categoryName);
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public void show() {
//		System.out.println("ī�װ� ���̵�: " + getCategoryId());
//		System.out.println("ī�װ�: " + getCategoryName());
//		System.out.println("��ǰ ���̵�: " + productId);
//		System.out.println("��ǰ��: " + productName);
//		System.out.println("����: " + price);
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "��ǰ ���̵�: " + productId + ", ��ǰ��: " + productName + ", ���� " + price + ", ī�װ� ���̵�: "
				+ getCategoryId() + ", ī�װ�: " + getCategoryName();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
