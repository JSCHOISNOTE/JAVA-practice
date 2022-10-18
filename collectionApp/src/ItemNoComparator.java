import java.util.Comparator;

public class ItemNoComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		if (o1.getNo() > o2.getNo()) {
			return 1;
		} else if (o1.getNo() < o2.getNo()) {
			return -1;
		} else {
			return 0;
		}
		
		
	}

}
