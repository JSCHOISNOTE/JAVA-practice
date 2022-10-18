import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*// �ּҷ� ���� ���α׷�
1. ����ó ���
2. ����ó �˻�
3. ����ó ����
4. ����ó ����
5. ��ü ����ó ���� ��ȸ
6. ����
�޴��� �����ϼ���.
*/

public class ContactApp {

	private static HashMap<String, Contact> map = new HashMap<String, Contact>();

	// ����ó ������ ����ϴ�.

	public static void addContact() {

		Scanner scan = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = scan.nextLine();

		System.out.print("�ڵ��� ��ȣ : ");
		String phone = scan.nextLine();

		System.out.print("e-mail : ");
		String email = scan.nextLine();

		map.put(name, new Contact(name, phone, email));

		System.out.println("����ó ������ ��ϵǾ����ϴ�.");

	}

	// ����ó ������ ��ȸ�ϴ�
	public static void findContactAll() {

		Set<String> keys = map.keySet();

		for (String key : keys) {
			Contact contact = map.get(key);
			System.out.println(contact);
		}

	}

	// ����ó�� �˻��ϴ�
	public static void findContact() {

		Scanner scan = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = scan.nextLine();

		Contact c = map.get(name);
		if (c == null) {
			System.out.println("�˻��ϰ��� �ϴ� �̸��� ��Ȯ�� �Է��ϼ���.");
		} else {
			System.out.println(c);
		}

	}

	// ����ó�� �����ϴ�
	public static void removeContact() {
		Scanner scan = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ���. :");
		String name = scan.nextLine();

		Contact contact = map.remove(name);

		if (contact != null) {
			System.out.printf("%s ����ó�� �����Ǿ����ϴ�.%n", name);
		} else {
			System.out.printf("%s�� ��ϵ� ����ó ������ �����ϴ�.%n", name);
		}
	}

	// ����ó�� �����ϴ�
	public static void modifyContact() {
		Scanner scan = new Scanner(System.in);

		System.out.print("�����Ϸ��� �̸��� �Է��ϼ���.");
		String name = scan.nextLine();

		if (!map.containsKey(name)) {
			System.out.println("�ش� �̸� ����");
			return;
		} else {
			System.out.println("�̸�: ");
			String name1 = scan.nextLine();

			System.out.println("��ȭ��ȣ: ");
			String phone = scan.nextLine();

			System.out.println("�̸���: ");
			String email = scan.nextLine();

			map.put(name, new Contact(name1, phone, email));
			System.out.println("����ó�� ��ϵǾ����ϴ�.");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean isExit = false;
		do {
			System.out.println("�ּҷ� ���� ���α׷�");
			System.out.println("1. ����ó ���");
			System.out.println("2. ����ó �˻�");
			System.out.println("3. ����ó ����");
			System.out.println("4. ����ó ����");
			System.out.println("5. ��ü ����ó ���� ��ȸ");
			System.out.println("6. ����");
			System.out.println("�޴��� �����ϼ���.");

			int item = Integer.parseInt(scan.nextLine());

			Menu[] menus = Menu.values();
			Menu menu = menus[item - 1];

			switch (menu) {
			case ADD:
				addContact();
				// ����ó ���
				break;
			case FIND:
				findContact();
				// ����ó �˻�
				break;
			case REMOVE:
				removeContact();
				// ����ó ����
				break;
			case MODIFY:
				modifyContact();
				// ����ó ����
				break;
			case FINDALL:
				findContactAll();
				// ����ó ��ü ��ȸ
				break;
			case EXIT:
				isExit = true;
				// ����
				break;

			}

		} while (!isExit);
	}
}
