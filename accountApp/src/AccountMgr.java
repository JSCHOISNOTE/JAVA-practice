import java.util.Scanner;

public class AccountMgr {
	// 클래스 변수
	static Account[] accounts = new Account[100];
	static int index = 0;

	// 전체 계좌 정보를 조회하다
	public static void retrieveAccounts() {
		for (int i = 0; i < index; i++) {
			accounts[i].printAccount();
		}

	}

	// 계좌개설하다
	public static void createAccount() {

		Scanner scan = new Scanner(System.in);

		System.out.print("계좌번호:    ");
		String accountNumber = scan.nextLine();

		System.out.print("이름:    ");
		String name = scan.nextLine();

		System.out.print("비밀번호:    ");
		String pwd = scan.nextLine();

		System.out.print("금액:    ");
		int balance = Integer.parseInt(scan.nextLine());

		// 인스턴스 생성자

		Account account = new Account(accountNumber, name, pwd, balance);
		accounts[index++] = account;
	}

	// 계좌번호에 해당하는 고객 계좌를 조회하다.

	public static Account findAccountByAccountNumber(String ac) {
		for (int i = 0; i < index; i++) {
			if (accounts[i].getAccountNumber().equals(ac)) {
				return accounts[i];
			}
		}
		return null;
	}

	// 입금하다

	public static void credit() {
		Scanner scan = new Scanner(System.in);

		System.out.print("계좌번호 :  ");
		String accountNumber = scan.nextLine();

		Account account = findAccountByAccountNumber(accountNumber);
		if (account == null) {
			System.out.println("계좌정보를 정확히 입력해주세요.");
			return;

		}

		System.out.print("금액 :  ");
		int amount = Integer.parseInt(scan.nextLine());

		account.deposit(amount);

		System.out.println("입금완료 !");
	}

	// 출금하다
	public static void debit() {
		Scanner sc = new Scanner(System.in);

		System.out.print("계좌번호 :  ");
		String accountNumber = sc.nextLine();

		Account account = findAccountByAccountNumber(accountNumber);
		if (account == null) {
			System.out.println("계좌정보를 정확히 입력해주세요.");
			return;
		}

		System.out.print("금액 :  ");
		int amount = Integer.parseInt(sc.nextLine());

		account.withdraw(amount);

		System.out.println("출금완료 !");

	}

	// 잔액조회하다
	public static void retrieveBalance() {

		Scanner sc = new Scanner(System.in);

		System.out.print("계좌번호 :  ");
		String accountNumber = sc.nextLine();

		Account account = findAccountByAccountNumber(accountNumber);
		if (account == null) {
			System.out.println("계좌정보를 정확히 입력해주세요.");
			return;
		}

		System.out.printf("잔액 : $,d원%n  ", account.getBalance());

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean isExit = false;
		do {
			System.out.println("===== 은행 입출금 관리 시스템 =====");
			System.out.println("1. 계좌개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.잔액조회");
			System.out.println("5.전체 계좌 조회");
			System.out.println("6.종료");
			System.out.print("항목을 선택하세요.");

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
