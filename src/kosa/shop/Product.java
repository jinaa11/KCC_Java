package kosa.shop;

public class Product extends Category {
	private int id;
	private String name;
	private int price;
//	private Category category;

	public Product() {
	}
	
	public Product(int id, String name, int id2, String name2, int price) {
		super(id, name);
		id = id2;
		name = name2;
		this.price = price;
	}

	// ī�װ� �߰�
//	public Product(int id, String name, int price) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
////		this.category = category;
//	}
	
	public void show() {
		System.out.println("ī�װ� ���̵�: " + getId());
		System.out.println("ī�װ�: " + getName());
		System.out.println("��ǰ ���̵�: " + id);
		System.out.println("��ǰ��: " + name);
		System.out.println("����: " + price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	public Category getCategory() {
//		return category;
//	}
//
//	public void setCategory(Category category) {
//		this.category = category;
//	}

}
