import java.util.ArrayList;

public class CartTest {
	
	public static void printCartList(ArrayList<Item> items) {
		if (items.isEmpty()) {
			System.out.println("��ٱ��Ͽ� �߰��� ��ǰ�� �������� �ʽ��ϴ�.");
			return;
		}
		
	}

	public static void main(String[] args) {

		Cart cart = new Cart("java");

		// ��ٱ��Ͽ� ���
		cart.addCart(new Item(1, "TV", 1, 100000));
		cart.addCart(new Item(2, "��Ʈ��", 2, 100000));
		cart.addCart(new Item(3, "����", 5, 100000));
		cart.addCart(new Item(4, "��ǻ��", 10, 100000));

		// ��ٱ��� ��� ��ȸ
		ArrayList<Item> items = cart.getItems();
		if (items.size() == 0) {
			System.out.println("�� ��ٱ���");
		} else {
			for (Item item : items) {
				System.out.printf("%s%n", item);
			}

		}
		System.out.println();

		// java ����ڰ� ��ٱ��ϸ� ����.
		// cart.emptyCart();

		// java �� ������� ��ٱ��� ����� ��ȸ�Ѵ�.
		if (items.size() == 0) {
			System.out.println("�� ��ٱ���");
		} else {
			for (Item item : items) {
				System.out.printf("%s%n", item);
			}
		}

		System.out.println();

		// java�� ������� ��ٱ��ϸ� �����Ѵ�
		// cart.removeCart(2);

		// java�� ������� ��ٱ��� ������ �����Ѵ�.
		// cart.updateCart(1, 10);

	}
}
