// 계좌를 구현한 클래스

class Account implements Comparable<Account> {
	// field
	// 인스턴스 변수
	private String accountNumber;
	private String name;
	private String pwd;
	private int balance;

	// 디폴트 생성자 메소드
	Account() {

	}

	// 매개변수 생성자 메소드
	Account(String accoutNumber, String name, String pwd, int balance) {
		this.accountNumber = accoutNumber;
		this.name = name;
		this.pwd = pwd;
		this.balance = balance;
	}

	// 인스턴스 메소드
	// 잔액을 조회하다.
	int getBalance() {
		return this.balance;
	}

	// 입금하다.
	void deposit(int amount) {
		this.balance += amount; // this.balance = this.balance + amount;
	}

	// 출금하다.
	void withdraw(int amount) {
		this.balance -= amount; // this.balance = this.balance - amount;
	}

	// 계좌이체하다.
	/*
	 * void transferAccount(Account account, int amount) {
	 * 
	 * }
	 */

	// 비밀번호를 변경하다.(setPwd)
	void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// 비밀번호를 조회하다. (getPwd)
	String getPwd() {
		return this.pwd;
	}

	// 계좌번호를 조회하다.
	public String getAccountNumber() {
		return accountNumber;
	}

	// 계좌정보를 조회하다.
	public void printAccount() {
		System.out.printf("계좌번호 : %s, 이름 : %s, 비밀빈호 : %s, 잔고 : %,d원%n", accountNumber, name, pwd, balance);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", pwd=" + pwd + ", balance=" + balance
				+ "]";
	}

	@Override
	public int compareTo(Account o) {
		// 게좌번호 순으로 오름차순 정렬하다.
		return this.accountNumber.compareTo(accountNumber);
	}

	@Override
	public int hashCode() {
		return accountNumber.hashCode() + name.hashCode() + pwd.hashCode() + Integer.valueOf(balance).hashCode();

	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Account)) {
			return false;
		}
		Account ac = (Account) obj;

		if (this.accountNumber.equals(ac.accountNumber) && this.name.equals(ac.name) && this.pwd.equals(ac.pwd)
				&& this.balance == ac.balance) {
			return true;
		}

		return false;
	}

}
