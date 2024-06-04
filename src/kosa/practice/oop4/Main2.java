package kosa.practice.oop4;

interface A {
	void abc();
}

class B {
	void bcd() {
		System.out.println("메서드 호출");
	}
}

public class Main2 {

	public static void main(String[] args) {
		A a = new A() {
			
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		a.abc();
		
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		
		a2.abc();
		
		B b = new B();
		A a3 = b::bcd;
		
		a3.abc();
	}

}
