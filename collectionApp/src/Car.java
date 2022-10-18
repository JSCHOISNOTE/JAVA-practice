
// �ڵ����� ������ Ŭ����
class Car {
	// field
	// �ν��Ͻ�����
	String name;
	String color;
	int direction;
	int speed;
	// Ŭ���� ����
	static String company;

	// Ŭ���� �ʱ�ȭ ���
	static {
		company = "����";
	}

	// ����Ʈ ������ �޼ҵ�
	Car() {

	}

	// �Ű����� ������ �޼ҵ�
	Car(String name, String color, int direction, int speed) {
		// System.out.printf("this : %s%n", this);
		this.name = name;
		this.color = color;
		this.direction = direction;
		this.speed = speed;
		this.company = company;

	}

	// �ν��Ͻ� �޼ҵ�
	// �����ϴ�.
	public void accelerate(int speed) {
		this.speed += speed; // this.speed = this. speed + speed;

	}

	// �����ϴ�.
	public void decelerate(int speed) {
		this.speed -= speed; // this.speed = this.speed - speed;
	}

	// ����ȸ�縦 ��ȸ�ϴ�.
	public static String getCompany() {
		// return Car.company
		return company;   // ������ Ŭ���������� Ŭ������ ���� ����    this x
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", direction=" + direction + ", speed=" + speed + "]";
	}
	
	
	
}
