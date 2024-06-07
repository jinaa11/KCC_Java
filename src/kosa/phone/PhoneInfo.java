package kosa.phone;

// 1���� ��ȭ��ȣ ������
public class PhoneInfo implements Comparable<PhoneInfo> {
	// (name, phoneNo, birth): �ʵ�
	private String name;
	private String phoneNo;
	private String birth;
	
	public PhoneInfo() {}

	public PhoneInfo(String name, String phoneNo, String birth) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	public void show() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phoneNo);
		System.out.println("�������: " + birth);
	}
	
	public void input() {
		System.out.print("�̸�: ");
		name = DataInput.sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		phoneNo = DataInput.sc.nextLine();
		System.out.print("�������: ");
		birth = DataInput.sc.nextLine();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public int compareTo(PhoneInfo o) {
		if(name.compareTo(o.name) > 0) {
			return 1;
		} else if(name.compareTo(o.name) < 0) {
			return -1;
		}
		return 0;
	}
}
