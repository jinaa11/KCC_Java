package kosa.practice.video;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video video;
	
	public GeneralMember() {}

	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void rent(Video video) {
		this.video = video;
	}
	
	public void show() {
		System.out.println("ȸ���� ���̵� :" + id);
		System.out.println("ȸ���� �̸� :" + name);
		System.out.println("ȸ���� �ּ� :" + address);
		
		video.show();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	
}
