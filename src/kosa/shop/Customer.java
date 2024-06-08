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
//		System.out.println("고객 아이디: " + id);
//		System.out.println("고객명: " + name);
//		System.out.println("주소: " + address);
//		System.out.println("휴대폰 번호: " + phoneNo);
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "고객 아이디: " + id + ", 이름: " + name + ", 주소: " + address + ", 휴대폰 번호: " + phoneNo;
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
