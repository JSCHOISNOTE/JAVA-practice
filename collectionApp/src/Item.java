
public class Item {
	// 인스턴스변수
	private int no; // 제품번호
	private String name; // 제품명
	private int quantity; // 제품 수량
	private int price; // 제품 가격

	// 디폴트 생성자
	Item() {

	}

	// 매개변수 생성자
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
		return "Item [번호=" + no + ", 제품명=" + name + ", 제품 수량=" + quantity + ", 제품가격=" + price + "]";
	}

}