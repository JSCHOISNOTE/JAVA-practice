import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {

		ArrayList<Car> carlist = new ArrayList<Car>();

		carlist.add(new Car("�ҳ�Ÿ", "���", 1, 60));
		carlist.add(new Car("�׷���", "��", 2, 70));
		carlist.add(new Car("���׽ý�", "ȸ��", 3, 80));

		for (Car temp : carlist) {
			System.out.printf("car : %s%n", temp.name);
		}

		Car temp = carlist.get(1);
		System.out.println(temp.color);

		// �ε��� ��ȣ�� 1�� �ڵ����� �߰��Ѵ�.
		carlist.add(1, new Car("�ƹݶ�", "���", 1, 60));

		for (Car car : carlist) {
			System.out.printf("%s%n", car);
		}
	}
}
