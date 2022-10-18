
// 자동차를 구현한 클래스
class Car {
	// field
	// 인스턴스변수
	String name;
	String color;
	int direction;
	int speed;
	// 클래스 변수
	static String company;

	// 클래스 초기화 블록
	static {
		company = "현대";
	}

	// 디폴트 생성자 메소드
	Car() {

	}

	// 매개변수 생성자 메소드
	Car(String name, String color, int direction, int speed) {
		// System.out.printf("this : %s%n", this);
		this.name = name;
		this.color = color;
		this.direction = direction;
		this.speed = speed;
		this.company = company;

	}

	// 인스턴스 메소드
	// 과속하다.
	public void accelerate(int speed) {
		this.speed += speed; // this.speed = this. speed + speed;

	}

	// 감속하다.
	public void decelerate(int speed) {
		this.speed -= speed; // this.speed = this.speed - speed;
	}

	// 제조회사를 조회하다.
	public static String getCompany() {
		// return Car.company
		return company;   // 동일한 클래스에서는 클래스명 생략 가능    this x
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", direction=" + direction + ", speed=" + speed + "]";
	}
	
	
	
}
