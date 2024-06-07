package kosa.phone;

// 1명의 전화번호 도메인
public class PhoneInfo implements Comparable<PhoneInfo> {
	// (name, phoneNo, birth): 필드
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
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNo);
		System.out.println("생년월일: " + birth);
	}
	
	public void input() {
		System.out.print("이름: ");
		name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
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
