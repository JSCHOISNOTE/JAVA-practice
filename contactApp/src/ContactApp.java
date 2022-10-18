import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*// 주소록 관리 프로그램
1. 연락처 등록
2. 연락처 검색
3. 연락처 삭제
4. 연락처 변경
5. 전체 연락처 정보 조회
6. 종료
메뉴를 선택하세요.
*/

public class ContactApp {

	private static HashMap<String, Contact> map = new HashMap<String, Contact>();

	// 연락처 정보를 등록하다.

	public static void addContact() {

		Scanner scan = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = scan.nextLine();

		System.out.print("핸드폰 번호 : ");
		String phone = scan.nextLine();

		System.out.print("e-mail : ");
		String email = scan.nextLine();

		map.put(name, new Contact(name, phone, email));

		System.out.println("연락처 정보가 등록되었습니다.");

	}

	// 연락처 정보를 조회하다
	public static void findContactAll() {

		Set<String> keys = map.keySet();

		for (String key : keys) {
			Contact contact = map.get(key);
			System.out.println(contact);
		}

	}

	// 연락처를 검색하다
	public static void findContact() {

		Scanner scan = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = scan.nextLine();

		Contact c = map.get(name);
		if (c == null) {
			System.out.println("검색하고자 하는 이름을 정확히 입력하세요.");
		} else {
			System.out.println(c);
		}

	}

	// 연락처를 삭제하다
	public static void removeContact() {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름을 입력하세요. :");
		String name = scan.nextLine();

		Contact contact = map.remove(name);

		if (contact != null) {
			System.out.printf("%s 연락처가 삭제되었습니다.%n", name);
		} else {
			System.out.printf("%s은 등록된 연락처 정보가 없습니다.%n", name);
		}
	}

	// 연락처를 변경하다
	public static void modifyContact() {
		Scanner scan = new Scanner(System.in);

		System.out.print("변경하려는 이름을 입력하세요.");
		String name = scan.nextLine();

		if (!map.containsKey(name)) {
			System.out.println("해당 이름 없음");
			return;
		} else {
			System.out.println("이름: ");
			String name1 = scan.nextLine();

			System.out.println("전화번호: ");
			String phone = scan.nextLine();

			System.out.println("이메일: ");
			String email = scan.nextLine();

			map.put(name, new Contact(name1, phone, email));
			System.out.println("연락처가 등록되었습니다.");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean isExit = false;
		do {
			System.out.println("주소록 관리 프로그램");
			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 검색");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 연락처 변경");
			System.out.println("5. 전체 연락처 정보 조회");
			System.out.println("6. 종료");
			System.out.println("메뉴를 선택하세요.");

			int item = Integer.parseInt(scan.nextLine());

			Menu[] menus = Menu.values();
			Menu menu = menus[item - 1];

			switch (menu) {
			case ADD:
				addContact();
				// 연락처 등록
				break;
			case FIND:
				findContact();
				// 연락처 검색
				break;
			case REMOVE:
				removeContact();
				// 연락처 삭제
				break;
			case MODIFY:
				modifyContact();
				// 연락처 변경
				break;
			case FINDALL:
				findContactAll();
				// 연락처 전체 조회
				break;
			case EXIT:
				isExit = true;
				// 종료
				break;

			}

		} while (!isExit);
	}
}
