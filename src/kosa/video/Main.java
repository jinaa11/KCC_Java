package kosa.video;

public class Main {

	public static void main(String[] args) {
//		GeneralMember gm1 = new GeneralMember("aaa", "ȫ�浿", "��ź");
//		GeneralMember gm2 = new GeneralMember("bbb", "��ö��", "����");

//		Video v1 = new Video(1, "Ʈ��������3", "������");
//		Video v2 = new Video(2, "��Ǫ�Ҵ�2", "������");
		
		Video videos[] = {
				new Video(1, "Ʈ��������3", "������"),
				new Video(2, "��Ǫ�Ҵ�2", "������")
		};

		// GeneralMember�� SpecialMember�� �Բ� �迭�� �ְ�
		// ������ rental(), show() ȣ�� �� ���
		// Ư�� SpecialMember�� specialPrint() ȣ��ǵ��� �Ͽ���.
		GeneralMember arr[] = { 
				new GeneralMember("aaa", "ȫ�浿", "��ź"), 
				new SpecialMember("bbb", "��ö��", "��ȭ", 100) 
				};

		// ������
		for (int i = 0; i < arr.length; i++) {
			arr[i].rent(videos[i]);
			arr[i].show();
			System.out.println();
			
			if (arr[i] instanceof SpecialMember) {
				((SpecialMember) arr[i]).specialPrint();
			}
		}

//		SpecialMember sm = new SpecialMember("a", "�ڱ浿", "��ȭ", 100);
//		sm.rent(v1);
//		sm.show();
//		sm.print();

//		gm1.rent(v2);
//		gm1.show();

	}
}
