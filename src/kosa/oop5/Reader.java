package kosa.oop5;

public class Reader extends Man implements Speakable {
	public Reader() {}
	
	public Reader(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return getName() + " �ڹ� ȭ����";
	}
	
}
