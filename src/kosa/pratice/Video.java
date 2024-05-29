package kosa.pratice;

public class Video {
	private String num;
	private String title;
	private String actor;
	
	public Video() {}
	
	public Video(String num, String title, String actor) {
		super();
		this.num = num;
		this.title = title;
		this.actor = actor;
	}
	
	public void show() {
		System.out.println("회원이 대여한 비디오 번호: " + num);
		System.out.println("회원이 대여한 비디오 제목: " + title);
		System.out.println("회원이 대여한 비디오 배우: " + actor);
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
	
	
}
