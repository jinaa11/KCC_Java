package kosa.video;

public class SpecialMember extends GeneralMember {
	private int bonusPoint;
	
	public SpecialMember() {}
	
	public SpecialMember(String id, String name, String address, int bonusPoint) {
		super(id, name, address);
		this.bonusPoint = bonusPoint;
	}

	@Override
	public void rent(Video video) {
		super.rent(video);
		this.bonusPoint += 100;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("ȸ���� ���ʽ� ������ ����: " + bonusPoint);
	}

	public void specialPrint() {
		System.out.println("����� ���");
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
}
