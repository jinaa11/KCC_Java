package kosa.basic;

public class ExceptionExam {
	
	// �ұ��� ���� ó��
	public static void noEquals(int a, int b) throws Exception {
		if (a == b) {
			throw new Exception("���� �� �ȵ�!");
		}
	}

	public static void main(String[] args) {
//		noEquals(10,10);
		
		try {
			System.out.println("1"); // ���
			noEquals(20, 10); // -> ���� �߻����� �ʾұ� ������ catch�� ���� X
			System.out.println("2"); // ��� X
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("3"); // ���
		} finally { // finally�� ���ܰ� �߻��ϵ� �߻����� �ʵ� ����
			System.out.println("4"); // ���
		}
		System.out.println("5"); // ���
		
		System.out.println("done...");
	}

}
