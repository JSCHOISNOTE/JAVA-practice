import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
	
	public static void printAccounts(ArrayList<Account> list) {
		for (Account account : list) {
			System.out.printf("%s%n", account);
		}
	}

	public static void main(String[] args) {

		ArrayList<Account> list = new ArrayList<Account>();

		// 요소 추가
		list.add(new Account("1111", "일길동", "0000", 1000));
		list.add(new Account("2222", "이길동", "0000", 2000));
		list.add(new Account("3333", "삼길동", "0000", 3000));
		list.add(new Account("4444", "사길동", "0000", 4000));
		list.add(new Account("5555", "오길동", "0000", 5000));
		
		
		printAccounts(list);
		
		// 계좌번호 순으로 오름차순정렬하다
		
		Collections.sort(list);
		
		System.out.println(" 정렬 후 ~ ");
		
		printAccounts(list);
		
		// 고객명으로 오름차순정렬한다.
		
		
	}
}
