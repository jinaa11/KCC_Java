package kosa.practice.oop2;

public class Work extends Man implements Speakable {
	public Work() {}
	
	public Work(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		return getName() + " ������ ���ؾ� �Ѵ�.";
	}

}
