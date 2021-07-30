package vo;
// Value Object ����

public class Member {
	
	// �ʵ�
	private int id;				// �ĺ�id
	private String name;		// �̸�
	private String phone;		// ����ó
	private int age;			// ����
	private String addr;		// �ּ�
	private String email;		// �̸���
	private String hobby;		// ���
	
	// �޼ҵ�
	// (1) getter, setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	// (2) toString()
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + ", addr=" + addr
				+ ", email=" + email + ", hobby=" + hobby + "]";
	}
	

	// ������
	// (1) �⺻ ������
	public Member() {
		super();
	}
	
	// (2) �Ű� ���� ������
	public Member(int id, String name, String phone, int age, String addr, String email, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.addr = addr;
		this.email = email;
		this.hobby = hobby;
	}
}
