// ���¸� ������ Ŭ����

class Account implements Comparable<Account> {
	// field
	// �ν��Ͻ� ����
	private String accountNumber;
	private String name;
	private String pwd;
	private int balance;

	// ����Ʈ ������ �޼ҵ�
	Account() {

	}

	// �Ű����� ������ �޼ҵ�
	Account(String accoutNumber, String name, String pwd, int balance) {
		this.accountNumber = accoutNumber;
		this.name = name;
		this.pwd = pwd;
		this.balance = balance;
	}

	// �ν��Ͻ� �޼ҵ�
	// �ܾ��� ��ȸ�ϴ�.
	int getBalance() {
		return this.balance;
	}

	// �Ա��ϴ�.
	void deposit(int amount) {
		this.balance += amount; // this.balance = this.balance + amount;
	}

	// ����ϴ�.
	void withdraw(int amount) {
		this.balance -= amount; // this.balance = this.balance - amount;
	}

	// ������ü�ϴ�.
	/*
	 * void transferAccount(Account account, int amount) {
	 * 
	 * }
	 */

	// ��й�ȣ�� �����ϴ�.(setPwd)
	void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// ��й�ȣ�� ��ȸ�ϴ�. (getPwd)
	String getPwd() {
		return this.pwd;
	}

	// ���¹�ȣ�� ��ȸ�ϴ�.
	public String getAccountNumber() {
		return accountNumber;
	}

	// ���������� ��ȸ�ϴ�.
	public void printAccount() {
		System.out.printf("���¹�ȣ : %s, �̸� : %s, ��к�ȣ : %s, �ܰ� : %,d��%n", accountNumber, name, pwd, balance);
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", pwd=" + pwd + ", balance=" + balance
				+ "]";
	}

	@Override
	public int compareTo(Account o) {
		// ���¹�ȣ ������ �������� �����ϴ�.
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
