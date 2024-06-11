package kosa.io;

import java.io.Serializable;

// 1���� ������ ���� Ŭ����
public class Video implements Serializable{
	private int num;
	private String title;
	private String actor;

	public Video() {
	}

	public Video(int num, String title, String actor) {
		this.num = num;
		this.title = title;
		this.actor = actor;
	}

	public void show() {
		System.out.println("ȸ���� �뿩�� ���� ��ȣ: " + num);
		System.out.println("ȸ���� �뿩�� ���� ����: " + title);
		System.out.println("ȸ���� �뿩�� ���� ���: " + actor);
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

	@Override
	public String toString() {
		return "Video [num=" + num + ", title=" + title + ", actor=" + actor + "]";
	}
	
}
