package kosa.bank;

public class Customer {
	private String id;
	private String name;
	private Account account; // 계좌는 초기화 불가능, 해당 고객의 계좌
	
	public Customer() {}

	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		// 고객 생성되면서 계좌도 생성
		this.account = new Account(id, balance); 
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
