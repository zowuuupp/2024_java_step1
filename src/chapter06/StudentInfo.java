package chapter06;

public class StudentInfo {
	
	//멤버변수=필드
	int studentID;
	private String studentName;
	int grade;
	String  address;
	
	//생성자
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자를 통해서 초기화한다. this 는 멤버변수를 가르키면 그 멤버변수 중에 grade에 grade를 써서 초기화 한다는 것이다. 공간을 아끼면서 초기화 하는 장점이 있다.
	public StudentInfo(int studentID, String studentName, int grade, String address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}

	//메소드
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	
	
	
	
	
	

}
