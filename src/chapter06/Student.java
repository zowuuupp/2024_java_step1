package chapter06;

public class Student {
	
	//멤버변수=필드
	int studentID;
	public String studentName;
	int grade;
	String address;
	
	//생성자 오버로딩
	public Student() {
		
	}

	public Student(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}
	
	//메소드
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//사용자가 만든 메소드
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);
	}
	
	
	
	
	
	

}
