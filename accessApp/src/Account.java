// ���� ����� ���� �ý���

class Account {

	// field
	// �ν��Ͻ�����
	private String name; // �̸�
	private String accountNumber; // ���¹�ȣ
	private String pwd; // ��й�ȣ
	private int balance; // �ܰ�
	// ����Ʈ ������ �޼ҵ�

	Account() {

	}

	// �Ű����� ������ �޼ҵ�
	Account(String name, String accountNumber, String pwd, int balance ) {
		this.balance = balance;
		this.name = name;
		this.accountNumber = accountNumber;
		this.pwd = pwd;
	}

	// �ν��Ͻ� �޼ҵ�
	// �Ա��ϴ�.
	public void deposit(int amount) {
		this.balance += amount; // this.balance = this.balance + amount;
	}

	// ����ϴ�.
	public void withdraw(int amount) {
		this.balance -= amount; // this.balance = this.balance - amount;
	}

	// �ܾ��� ��ȸ�ϴ�.
	public int getBalance() {
		return balance;
	}

	// ������ü�ϴ�.
	public void transferAccount(Account account, int amount) {
		this.accountNumber += amount;
	}

	// ��й�ȣ �����ϴ�.
	void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// ��й�ȣ ��ȸ�ϴ�.
	public String getPwd() {
		return this.pwd;
	}
	
	// ���¹�ȣ�� ��ȸ�ϴ�.
	public String getaccountNumber() {
		return this.getaccountNumber();
	}
	
	// ���������� ��ȸ�ϴ�.
	public void printAccount(){
		System.out.printf("���¹�ȣ : %s �̸� : %s  ��й�ȣ : %s  �ܰ� : %,d��%n", accountNumber, name, pwd, balance);
	}
}
