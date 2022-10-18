import java.util.Scanner;

public class AccountMgr {
	// Ŭ���� ����
	static Account[] accounts = new Account[100];
	static int index = 0;

	// ��ü ���� ������ ��ȸ�ϴ�
	public static void retrieveAccounts() {
		for (int i = 0; i < index; i++) {
			accounts[i].printAccount();
		}

	}

	// ���°����ϴ�
	public static void createAccount() {

		Scanner scan = new Scanner(System.in);

		System.out.print("���¹�ȣ:    ");
		String accountNumber = scan.nextLine();

		System.out.print("�̸�:    ");
		String name = scan.nextLine();

		System.out.print("��й�ȣ:    ");
		String pwd = scan.nextLine();

		System.out.print("�ݾ�:    ");
		int balance = Integer.parseInt(scan.nextLine());

		// �ν��Ͻ� ������

		Account account = new Account(accountNumber, name, pwd, balance);
		accounts[index++] = account;
	}

	// ���¹�ȣ�� �ش��ϴ� �� ���¸� ��ȸ�ϴ�.

	public static Account findAccountByAccountNumber(String ac) {
		for (int i = 0; i < index; i++) {
			if (accounts[i].getAccountNumber().equals(ac)) {
				return accounts[i];
			}
		}
		return null;
	}

	// �Ա��ϴ�

	public static void credit() {
		Scanner scan = new Scanner(System.in);

		System.out.print("���¹�ȣ :  ");
		String accountNumber = scan.nextLine();

		Account account = findAccountByAccountNumber(accountNumber);
		if (account == null) {
			System.out.println("���������� ��Ȯ�� �Է����ּ���.");
			return;

		}

		System.out.print("�ݾ� :  ");
		int amount = Integer.parseInt(scan.nextLine());

		account.deposit(amount);

		System.out.println("�ԱݿϷ� !");
	}

	// ����ϴ�
	public static void debit() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���¹�ȣ :  ");
		String accountNumber = sc.nextLine();

		Account account = findAccountByAccountNumber(accountNumber);
		if (account == null) {
			System.out.println("���������� ��Ȯ�� �Է����ּ���.");
			return;
		}

		System.out.print("�ݾ� :  ");
		int amount = Integer.parseInt(sc.nextLine());

		account.withdraw(amount);

		System.out.println("��ݿϷ� !");

	}

	// �ܾ���ȸ�ϴ�
	public static void retrieveBalance() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���¹�ȣ :  ");
		String accountNumber = sc.nextLine();

		Account account = findAccountByAccountNumber(accountNumber);
		if (account == null) {
			System.out.println("���������� ��Ȯ�� �Է����ּ���.");
			return;
		}

		System.out.printf("�ܾ� : $,d��%n  ", account.getBalance());

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean isExit = false;
		do {
			System.out.println("===== ���� ����� ���� �ý��� =====");
			System.out.println("1. ���°���");
			System.out.println("2.�Ա�");
			System.out.println("3.���");
			System.out.println("4.�ܾ���ȸ");
			System.out.println("5.��ü ���� ��ȸ");
			System.out.println("6.����");
			System.out.print("�׸��� �����ϼ���.");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {

			case 1:
				createAccount();
				break;
			case 2:
				credit();
				break;
			case 3:
				debit();
				break;
			case 4:
				retrieveBalance();
				break;
			case 5:
				retrieveAccounts();
				break;
			case 6:
				isExit = true;
				break;

			}

		} while (!isExit);
	}

}
