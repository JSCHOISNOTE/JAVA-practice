// 은행 입출금 관리 시스템

class Account {

	// field
	// 인스턴스변수
	private String name; // 이름
	private String accountNumber; // 계좌번호
	private String pwd; // 비밀번호
	private int balance; // 잔고
	// 디폴트 생성자 메소드

	Account() {

	}

	// 매개변수 생성자 메소드
	Account(String name, String accountNumber, String pwd, int balance ) {
		this.balance = balance;
		this.name = name;
		this.accountNumber = accountNumber;
		this.pwd = pwd;
	}

	// 인스턴스 메소드
	// 입금하다.
	public void deposit(int amount) {
		this.balance += amount; // this.balance = this.balance + amount;
	}

	// 출금하다.
	public void withdraw(int amount) {
		this.balance -= amount; // this.balance = this.balance - amount;
	}

	// 잔액을 조회하다.
	public int getBalance() {
		return balance;
	}

	// 계좌이체하다.
	public void transferAccount(Account account, int amount) {
		this.accountNumber += amount;
	}

	// 비밀번호 변경하다.
	void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// 비밀번호 조회하다.
	public String getPwd() {
		return this.pwd;
	}
	
	// 계좌번호를 조회하다.
	public String getaccountNumber() {
		return this.getaccountNumber();
	}
	
	// 계좌정보를 조회하다.
	public void printAccount(){
		System.out.printf("계좌번호 : %s 이름 : %s  비밀번호 : %s  잔고 : %,d원%n", accountNumber, name, pwd, balance);
	}
}
