
public class Contact {

	// �ν��Ͻ� ����
	private String name;
	private String phone;
	private String email;

	// ����Ʈ ������
	Contact() {

	}

	public Contact(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [�̸�=" + name + ", �ڵ��� ��ȣ=" + phone + ", e-mail=" + email + "]";
	}

}
