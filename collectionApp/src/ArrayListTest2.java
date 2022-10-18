import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {

		ArrayList<Car> carlist = new ArrayList<Car>();

		carlist.add(new Car("소나타", "흰색", 1, 60));
		carlist.add(new Car("그렌져", "블랙", 2, 70));
		carlist.add(new Car("제네시스", "회색", 3, 80));

		for (Car temp : carlist) {
			System.out.printf("car : %s%n", temp.name);
		}

		Car temp = carlist.get(1);
		System.out.println(temp.color);

		// 인덱스 번호가 1에 자동차를 추가한다.
		carlist.add(1, new Car("아반떼", "흰색", 1, 60));

		for (Car car : carlist) {
			System.out.printf("%s%n", car);
		}
	}
}
