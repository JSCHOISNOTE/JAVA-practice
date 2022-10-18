import java.util.ArrayList;

public class Cart {

	private String userId;
	private ArrayList<Item> items = new ArrayList<Item>();

	public Cart(String userId) {
		this.userId = userId;
	}

	// 장바구니 담기
	public void addCart(Item item) {

		boolean isExist = false;

		for (Item temp : items) {
			if (temp.getNo() == item.getNo()) {
				temp.setQuantity(temp.getQuantity() + item.getQuantity());
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			items.add(item);
		}

	}

	// 장바구니 목표를 조회하다.
	public ArrayList<Item> getItems() {
		return items;
	}

	// 장바구니 수량 변경하다.
	public void updateCart(int no, int quantity) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getNo() == no) {
				items.get(i).setQuantity(quantity);
				break;
			}
		}
	}

	// 장바구니 삭제
	public void removeCart(int no) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getNo() == no) {
				items.remove(i);
				break;
			}
		}
	}

	// 장바구니 비우기
	public void emptyCart() {
		items.clear();
	}

}
