package kosa.practice.oop4;

interface AA {
	BB abc();
}

class BB {
	BB() {
		System.out.println("BB »ý¼ºÀÚ");
	}
}

public class Main3 {

	public static void main(String[] args) {
		AA a = new AA() {
			
			@Override
			public BB abc() {
				return new BB();
			}
		};
		a.abc();
		
		AA a2 = () -> new BB();
		a2.abc();
		
		AA a3 = BB::new;
		a3.abc();
	}

}
