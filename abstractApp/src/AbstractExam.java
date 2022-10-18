
// 사원 클래스 : 추상 클래스

abstract class Employee {
	// 인스턴스 변수
	String no;
	String name;
	String initDay;

	// 디폴트 생성자 메소드
	Employee() {
		super();
	}

	// 매개변수 생성자 메소드
	Employee(String no, String name, String initDay) {
		super();
		this.no = no;
		this.name = name;
		this.initDay = initDay;
	}

	// 추상 메소드
	// 급여를 계산하다.
	public abstract int payCheck();

	// 구상메소드
	public void printEmployee() {
		System.out.printf("사번 : %s 이름 : %s 입사일자: %s", no, name, initDay);
	}

} // end of Employee class

// 구상클래스
class Regular extends Employee {
	// 인스턴스 변수
	int pay;

// 디폴트 생성자 메소드
	Regular() {
		super();
	}

	// 매개변수 생성자 메소드
	Regular(String no, String name, String initDay, int pay) {
		super(no, name, initDay);
		this.pay = pay;
	}

	// 구상메소드
	// 급여를 계산하다.
	public int payCheck() {
		return pay;
	}

} // end of Regular class

public class AbstractExam {

	public static void main(String[] args) {

		// 정규직 사원 인스턴스 생성
		Regular emp = new Regular("E001", "일길동", "2022-01-01", 3000000);

		// 1. 사번이 R001인 사원의 기본정보를 조회하여 출력하시오.
		emp.printEmployee();
		System.out.println();

		// 2. 사번이 R001인 사원의 급여를 조회하여 출력하시오
		int pay = emp.payCheck();
		System.out.printf("급여 : %,d원%n", pay);

	}

}
