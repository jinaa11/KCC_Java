package kosa.oop;

public class StaticExam {
	int total;
	static int grandTotal;
	
	public static void add() {
		grandTotal += 10;
//		total += 20; // �޸𸮰� �����Ǵ� ������ �޶� ����, �ʵ�� ��ü �����ؾ� ��� �����ѵ� total�� static �޼ҵ忡�� ȣ���ؼ� ����
	}
	
	public static void main(String[] args) {
		add();

	}

}
