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
		System.out.println("회원의 아이디 :" + id);
		System.out.println("회원의 이름 :" + name);
		System.out.println("회원의 주소 :" + address);
//		for(Video v : videos) {
//			System.out.println("회원이 대여한 비디오 번호: " +v.getNum());
//			System.out.println("회원이 대여한 비디오 제목: " + v.getTitle());
//			System.out.println("회원이 대여한 비디오 주인공: " + v.getActor());
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
