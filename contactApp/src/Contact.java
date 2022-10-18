
public class Contact {

	// 인스턴스 변수
	private String name;
	private String phone;
	private String email;

	// 디폴트 생성자
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
		return "Contact [이름=" + name + ", 핸드폰 번호=" + phone + ", e-mail=" + email + "]";
	}

}
