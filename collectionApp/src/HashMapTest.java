import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, Contact> map = new HashMap<String, Contact>();

		Contact c1 = new Contact("일길동", "010-1111-1111", "java1@gmail.com");
		Contact c2 = new Contact("이길동", "010-2222-2222", "java2@gmail.com");
		Contact c3 = new Contact("삼길동", "010-3333-3333", "java3@gmail.com");
		Contact c4 = new Contact("사길동", "010-4444-4444", "java4@gmail.com");

		map.put(c1.getName(), c1);
		map.put(c2.getName(), c2);
		map.put(c3.getName(), c3);
		map.put(c4.getName(), c4);

		Set<String> keys = map.keySet();
		for (String key : keys) {
			Contact temp = map.get(key);
			System.out.printf("key : %s%n", key);
			System.out.printf("value : %s%n", temp.toString());
		}
	}
}
