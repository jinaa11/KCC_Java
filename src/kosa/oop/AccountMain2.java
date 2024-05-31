package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		// �θ��� ������ Ÿ������ �ڽĵ��� ���� �� ����
		// Account�� �ڵ� ĳ����
		Account arr[] = {
				new Account("111-111", "ȫ�浿", 10000), // ó������ �θ�� ���� ĳ����X
				new CheckingAccount("111-111", "ȫ�浿", 20000, "222-222"),
				new MinusAccount("333-333", "��浿", 30000, 20000) // ������ ���̶� ���� ĳ����X
		};
		
		for(int i = 0; i < arr.length; i++) {
			// �ʿ信 ���� �ڽ����� ������ �ʹ�.
			// instanceof�� ĳ������ ������ �� ���� Ȯ��, true/false�� ��ȯ�ϱ� ������ if���� �Բ� ����
			if(arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount)arr[i]).pay("222-222", 5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(arr[1].getBalance());
		
		// ===== ���� ======
		// �θ�� ����ȯ
//		Account ca = new CheckingAccount("111-111","ȫ�浿", 100000, "222-222");
//		
//		CheckingAccount obj = (CheckingAccount)ca; // ���� ����ȯ
//		
//		try {
//			obj.pay("222-222", 10000); // �θ�� ����ȯ �� �ڽŸ��� ������ �ִ� �޼ҵ�� �� �̻� ���� X
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(ca.getBalance());
	}

}
