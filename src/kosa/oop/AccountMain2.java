package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		// 부모의 데이터 타입으로 자식들이 모일 수 있음
		// Account로 자동 캐스팅
		Account arr[] = {
				new Account("111-111", "홍길동", 10000), // 처음부터 부모라서 강제 캐스팅X
				new CheckingAccount("111-111", "홍길동", 20000, "222-222"),
				new MinusAccount("333-333", "김길동", 30000, 20000) // 형제는 남이라서 강제 캐스팅X
		};
		
		for(int i = 0; i < arr.length; i++) {
			// 필요에 따라 자식으로 돌리고 싶다.
			// instanceof는 캐스팅이 가능한 지 여부 확인, true/false로 반환하기 때문에 if문과 함께 쓰기
			if(arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount)arr[i]).pay("222-222", 5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(arr[1].getBalance());
		
		// ===== 정리 ======
		// 부모로 형변환
//		Account ca = new CheckingAccount("111-111","홍길동", 100000, "222-222");
//		
//		CheckingAccount obj = (CheckingAccount)ca; // 강제 형변환
//		
//		try {
//			obj.pay("222-222", 10000); // 부모로 형변환 후 자신만이 가지고 있는 메소드는 더 이상 접근 X
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(ca.getBalance());
	}

}
