import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Account> list = new ArrayList<Account>();

		// 요소 추가
		list.add(new Account("1111", "일길동", "0000", 1000));
		list.add(new Account("2222", "이길동", "0000", 2000));
		list.add(new Account("3333", "삼길동", "0000", 3000));

		int size = list.size();
		System.out.printf("size : %d%n", size);

		for (int i = 0; i < list.size(); i++) {
			Account account = list.get(i);
			System.out.printf("계좌번호 : %s, 잔고 : %,d원%n", account.getAccountNumber(), account.getBalance());
		}

		for (Account temp : list) {
			System.out.printf("계좌번호 : %s, 잔고 : %,d원%n", temp.getAccountNumber(), temp.getBalance());
		}

	}
}
