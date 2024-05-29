package kosa.video;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video rentalVideo;
	
//	private List<Video> videos;
	
	public GeneralMember() {}

	public GeneralMember(String id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
//		videos = new ArrayList<Video>();
	}
	
	public void rent(Video video) {
		this.rentalVideo = video;
	}
	
//	public void cancel(Video video) {
//		if(videos.contains(video)) {
//			video.removeVideo(this);
//		}
//	}
	
	public void show() {
		System.out.println("ȸ���� ���̵� :" + id);
		System.out.println("ȸ���� �̸� :" + name);
		System.out.println("ȸ���� �ּ� :" + address);
//		for(Video v : videos) {
//			System.out.println("ȸ���� �뿩�� ���� ��ȣ: " +v.getNum());
//			System.out.println("ȸ���� �뿩�� ���� ����: " + v.getTitle());
//			System.out.println("ȸ���� �뿩�� ���� ���ΰ�: " + v.getActor());
//		}
		rentalVideo.show();
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
