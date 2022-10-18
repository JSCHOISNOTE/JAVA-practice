import java.util.ArrayList;

public class Cart {

	private String userId;
	private ArrayList<Item> items = new ArrayList<Item>();

	public Cart(String userId) {
		this.userId = userId;
	}

	// ��ٱ��� ���
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

	// ��ٱ��� ��ǥ�� ��ȸ�ϴ�.
	public ArrayList<Item> getItems() {
		return items;
	}

	// ��ٱ��� ���� �����ϴ�.
	public void updateCart(int no, int quantity) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getNo() == no) {
				items.get(i).setQuantity(quantity);
				break;
			}
		}
	}

	// ��ٱ��� ����
	public void removeCart(int no) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getNo() == no) {
				items.remove(i);
				break;
			}
		}
	}

	// ��ٱ��� ����
	public void emptyCart() {
		items.clear();
	}

}
