import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void print(HashSet<Account> sets) {
		/*
		 * for (Account temp : sets) { System.out.printf("%s%n", temp); }
		 */

		Iterator<Account> i = sets.iterator();
		while (i.hasNext()) {
			Account ac = i.next();
			System.out.printf("%s%n", ac);
		}
	}

	public static void main(String[] args) {

		HashSet<Account> sets = new HashSet<Account>();

		// 요소 추가
		Account obj1 = new Account("1111", "일길동", "0000", 1000);
		Account obj2 = new Account("2222", "이길동", "0000", 2000);
		Account obj3 = new Account("3333", "삼길동", "0000", 3000);
		Account obj4 = new Account("1111", "일길동", "0000", 1000);

		System.out.printf("obj1 : %d%n", obj1.hashCode());
		System.out.printf("obj2 : %d%n", obj2.hashCode());
		System.out.printf("obj3 : %d%n", obj3.hashCode());
		System.out.printf("obj4 : %d%n", obj4.hashCode());

		sets.add(obj1);
		sets.add(obj2);
		sets.add(obj3);
		sets.add(obj4);

		print(sets);

	}
}
