package kosa.board;

public class Board {
	private int num;
	private String title;
	private String content;

	public Board() {
	}

	public Board(int num, String title, String content) {
		this.num = num;
		this.title = title;
		this.content = content;
	}

	public void print() {
		System.out.println("�� ��ȣ: " + num);
		System.out.println("����: " + title);
		System.out.println("����: " + content);
	}

	public int getNum() {
		return num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
