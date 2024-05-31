package kosa.oop;

public class StaticExam {
	int total;
	static int grandTotal;
	
	public static void add() {
		grandTotal += 10;
//		total += 20; // 메모리가 생성되는 시점이 달라서 오류, 필드는 객체 생성해야 사용 가능한데 total을 static 메소드에서 호출해서 오류
	}
	
	public static void main(String[] args) {
		add();

	}

}
