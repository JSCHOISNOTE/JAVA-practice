
public class Item {
	// �ν��Ͻ�����
	private int no; // ��ǰ��ȣ
	private String name; // ��ǰ��
	private int quantity; // ��ǰ ����
	private int price; // ��ǰ ����

	// ����Ʈ ������
	Item() {

	}

	// �Ű����� ������
	public Item(int no, String name, int quantity, int price) {
		super();
		this.no = no;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [��ȣ=" + no + ", ��ǰ��=" + name + ", ��ǰ ����=" + quantity + ", ��ǰ����=" + price + "]";
	}

}