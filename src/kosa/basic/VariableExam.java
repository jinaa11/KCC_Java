package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// ������ �����͸� ��� �׸� ex) ȫ�浿, 100, 3.14, true
		// byte, short, int, long, float, double, boolean, char << �⺻�� ������(Primitive Type)
		int num; // ���� ����: �޸� �Ҵ� << ���� ������ ���� ����
		int arr[]; // �迭 ����: Object Type << ����(���� ������ ���� ������� ����)
		num = 10; // =: ���� ������
		
		// ���� ����, �ʱ�ȭ
		int num2 = 100;
		
		// ���ڿ�: String - ������
		String name = "ȫ�浿";
		System.out.println(name + "��");
		
		// ���� ����
		// ������: Ư������ X, ���� ����X, �ҹ��ڷ� ����, _
		
		// �⺻ ���ͷ�: 100 -> int, "" -> String, 'A' -> char, true -> boolean, 3.14 -> double
		float a = 3.14f; // float ������ ĳ���� ���ֱ�
		
		// casting (�� ��ȯ)
		// ����: byte < short < int < long < float < double, int <=> char
		double b = 100; // ���� �ſ��� ū �ŷδ� �ڵ� ĳ������ �Ǿ ����(������ ĳ����)
		int c = (int)3.14;
		System.out.println(c);
		
		float num3 = 3.14f;
		long num4 = 100;
		
		int num5 = 010; // 8����
		System.out.println(num5);
		
		
	}

}