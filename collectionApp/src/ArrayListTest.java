import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Account> list = new ArrayList<Account>();

		// ��� �߰�
		list.add(new Account("1111", "�ϱ浿", "0000", 1000));
		list.add(new Account("2222", "�̱浿", "0000", 2000));
		list.add(new Account("3333", "��浿", "0000", 3000));

		int size = list.size();
		System.out.printf("size : %d%n", size);

		for (int i = 0; i < list.size(); i++) {
			Account account = list.get(i);
			System.out.printf("���¹�ȣ : %s, �ܰ� : %,d��%n", account.getAccountNumber(), account.getBalance());
		}

		for (Account temp : list) {
			System.out.printf("���¹�ȣ : %s, �ܰ� : %,d��%n", temp.getAccountNumber(), temp.getBalance());
		}

	}
}
