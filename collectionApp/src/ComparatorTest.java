import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	public static void printItems(ArrayList<Item> list) {

		for (Item item : list) {
			System.out.printf("%s%n", item);
		}
	}

	public static void main(String[] args) {

		ArrayList<Item> list = new ArrayList<Item>();

		list.add(new Item(1, "TV", 1, 10000000));
		list.add(new Item(3, "Audio", 5, 30000000));
		list.add(new Item(5, "NoteBook", 6, 90000000));
		list.add(new Item(4, "Video", 8, 60000000));
		list.add(new Item(2, "Radio", 2, 40000000));

		printItems(list);

		// 제품번호순으로 오름차순 정렬하여 출력하시오.
		ItemNoComparator comparator = new ItemNoComparator();
		Collections.sort(list, comparator);

		System.out.println("정렬후 ~");
		printItems(list);

		// 제품이름순으로 오름차순 정렬하여 출력하시오.

		Comparator<Item> comparator1 = new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o1.getName().compareTo(o2.getName());

			}

		};

		Collections.sort(list, comparator1);

		System.out.println("정렬 후 ~");
		printItems(list);
	}
}
