import java.util.ArrayList;

public class CartTest {
	
	public static void printCartList(ArrayList<Item> items) {
		if (items.isEmpty()) {
			System.out.println("장바구니에 추가된 물품이 존재하지 않습니다.");
			return;
		}
		
	}

	public static void main(String[] args) {

		Cart cart = new Cart("java");

		// 장바구니에 담기
		cart.addCart(new Item(1, "TV", 1, 100000));
		cart.addCart(new Item(2, "노트북", 2, 100000));
		cart.addCart(new Item(3, "지갑", 5, 100000));
		cart.addCart(new Item(4, "컴퓨터", 10, 100000));

		// 장바구니 목록 조회
		ArrayList<Item> items = cart.getItems();
		if (items.size() == 0) {
			System.out.println("빈 장바구니");
		} else {
			for (Item item : items) {
				System.out.printf("%s%n", item);
			}

		}
		System.out.println();

		// java 사용자가 장바구니를 비운다.
		// cart.emptyCart();

		// java 가 사용자의 장바구니 목록을 조회한다.
		if (items.size() == 0) {
			System.out.println("빈 장바구니");
		} else {
			for (Item item : items) {
				System.out.printf("%s%n", item);
			}
		}

		System.out.println();

		// java가 사용자의 장바구니를 삭제한다
		// cart.removeCart(2);

		// java가 사용자의 장바구니 수량을 변경한다.
		// cart.updateCart(1, 10);

	}
}
