package kosa.basic;

public class ExceptionExam {
	
	// 소극적 예외 처리
	public static void noEquals(int a, int b) throws Exception {
		if (a == b) {
			throw new Exception("같은 값 안돼!");
		}
	}

	public static void main(String[] args) {
//		noEquals(10,10);
		
		try {
			System.out.println("1"); // 출력
			noEquals(20, 10); // -> 예외 발생하지 않았기 때문에 catch문 실행 X
			System.out.println("2"); // 출력 X
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("3"); // 출력
		} finally { // finally는 예외가 발생하든 발생하지 않든 실행
			System.out.println("4"); // 출력
		}
		System.out.println("5"); // 출력
		
		System.out.println("done...");
	}

}
