package kosa.video;

import java.util.ArrayList;
import java.util.List;

// 1���� ������ ���� Ŭ����
public class Video {
	private int num;
	private String title;
	private String actor;
	private List<GeneralMember> members;
	
	public Video() {}

	public Video(int num, String title, String actor) {
		this.num = num;
		this.title = title;
		this.actor = actor;
		members = new ArrayList<GeneralMember>();
	}
	
	public void show() {
		System.out.println("ȸ���� �뿩�� ���� ��ȣ: " + num);
		System.out.println("ȸ���� �뿩�� ���� ����: " + title);
		System.out.println("ȸ���� �뿩�� ���� ���: " + actor);
	}
	
	public void addVideo(GeneralMember member) {
		members.add(member);
	}
	
	public void removeVideo(GeneralMember member) {
		members.remove(member);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
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
