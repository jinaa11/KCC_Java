package kosa.video;

public class Main {

	public static void main(String[] args) {
		GeneralMember gm1 = new GeneralMember("aaa", "ȫ�浿", "��ź");
		GeneralMember gm2 = new GeneralMember("bbb", "��ö��", "����");
	
		Video v1 = new Video(1, "Ʈ��������3", "������");
		Video v2 = new Video(2, "��Ǫ�Ҵ�2", "������");
		
		gm1.rent(v1);
		gm1.show();

	}
}
