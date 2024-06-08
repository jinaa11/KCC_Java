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
//		System.out.println("카테고리 아이디: " + getCategoryId());
//		System.out.println("카테고리: " + getCategoryName());
//		System.out.println("상품 아이디: " + productId);
//		System.out.println("상품명: " + productName);
//		System.out.println("가격: " + price);
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "상품 아이디: " + productId + ", 상품명: " + productName + ", 가격 " + price + ", 카테고리 아이디: "
				+ getCategoryId() + ", 카테고리: " + getCategoryName();
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
