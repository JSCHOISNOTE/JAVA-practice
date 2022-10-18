
public class GenericTest {

	public static void main(String[] args) {

		Item item = new Item(1, "TV",10,10000);
		// Integer item = Integer.valueOf(1);
		Box<Item> box = new Box<Item>(item);

		Item temp = box.getItem();

		System.out.printf("no : %d%n", temp.getNo());
		//System.out.printf("name : %s%n", temp.getName());

	}
}
