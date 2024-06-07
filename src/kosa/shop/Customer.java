package kosa.shop;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String phoneNo;
	
	public Customer() {}

	public Customer(int id, String name, String address, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public void show() {
		System.out.println("°í°´ ¾ÆÀÌµð: " + id);
		System.out.println("°í°´¸í: " + name);
		System.out.println("ÁÖ¼Ò: " + address);
		System.out.println("ÈÞ´ëÆù ¹øÈ£: " + phoneNo);
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
