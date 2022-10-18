
// ��� Ŭ���� : �߻� Ŭ����

abstract class Employee {
	// �ν��Ͻ� ����
	String no;
	String name;
	String initDay;

	// ����Ʈ ������ �޼ҵ�
	Employee() {
		super();
	}

	// �Ű����� ������ �޼ҵ�
	Employee(String no, String name, String initDay) {
		super();
		this.no = no;
		this.name = name;
		this.initDay = initDay;
	}

	// �߻� �޼ҵ�
	// �޿��� ����ϴ�.
	public abstract int payCheck();

	// ����޼ҵ�
	public void printEmployee() {
		System.out.printf("��� : %s �̸� : %s �Ի�����: %s", no, name, initDay);
	}

} // end of Employee class

// ����Ŭ����
class Regular extends Employee {
	// �ν��Ͻ� ����
	int pay;

// ����Ʈ ������ �޼ҵ�
	Regular() {
		super();
	}

	// �Ű����� ������ �޼ҵ�
	Regular(String no, String name, String initDay, int pay) {
		super(no, name, initDay);
		this.pay = pay;
	}

	// ����޼ҵ�
	// �޿��� ����ϴ�.
	public int payCheck() {
		return pay;
	}

} // end of Regular class

public class AbstractExam {

	public static void main(String[] args) {

		// ������ ��� �ν��Ͻ� ����
		Regular emp = new Regular("E001", "�ϱ浿", "2022-01-01", 3000000);

		// 1. ����� R001�� ����� �⺻������ ��ȸ�Ͽ� ����Ͻÿ�.
		emp.printEmployee();
		System.out.println();

		// 2. ����� R001�� ����� �޿��� ��ȸ�Ͽ� ����Ͻÿ�
		int pay = emp.payCheck();
		System.out.printf("�޿� : %,d��%n", pay);

	}

}
