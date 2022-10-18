import java.util.ArrayList;

public class ArrayTest2 {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<Integer>();

		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);

		for (Integer temp : obj) {
			// Integer -> int : unboxing
			System.out.printf("%d%n", temp);
		}

	}
}
