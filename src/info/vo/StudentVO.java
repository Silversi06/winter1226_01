package info.vo;

public class StudentVO {
	private String name;//����
	private int stuId;//�й�
	private int grade;//�г�
	private String major;//����
	private String address;//�ּ�
	private String mobile;//��ȭ��ȣ
	
	//������
	//�л������� �����ϴ� Object(Value Object)
	//�ʵ�: ���� �����ϱ� ����
	//Getter,Setter �޼ҵ� : �ʵ� ���� ���� �Ǵ� ��ȯ�ϴ� �޼ҵ�
	//������ : ��ü �ʵ� ���� �ʱ�ȭ
	public StudentVO(String name, int stuId, int grade, String major, String address, String mobile) {
		this.name = name;
		this.stuId = stuId;
		this.grade = grade;
		this.major = major;
		this.address = address;
		this.mobile = mobile;
	}
	
	//getter,setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", stuId=" + stuId + ", grade=" + grade + ", major=" + major + ", address="
				+ address + ", mobile=" + mobile + "]";
	}

	
}
