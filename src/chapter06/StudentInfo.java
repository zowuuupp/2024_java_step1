package chapter06;

public class StudentInfo {
	
	//�������=�ʵ�
	int studentID;
	private String studentName;
	int grade;
	String  address;
	
	//������
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	
	//�����ڸ� ���ؼ� �ʱ�ȭ�Ѵ�. this �� ��������� ����Ű�� �� ������� �߿� grade�� grade�� �Ἥ �ʱ�ȭ �Ѵٴ� ���̴�. ������ �Ƴ��鼭 �ʱ�ȭ �ϴ� ������ �ִ�.
	public StudentInfo(int studentID, String studentName, int grade, String address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}

	//�޼ҵ�
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	
	
	
	
	
	

}
