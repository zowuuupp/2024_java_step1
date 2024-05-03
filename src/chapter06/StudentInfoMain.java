package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		//1. 멤버변수 직접 초기화 studentKim
		StudentInfo studentKim = new StudentInfo();
		System.out.println(studentKim.address); //null
		studentKim.studentID=1000;
		studentKim.grade=4;
		studentKim.address="도봉구";
		System.out.println(studentKim.address); 
		
		
		//2. 생성자를 통한 초기화 studentLee
		StudentInfo studentLee = new StudentInfo(1004, "백설", 1, "일산동구");
		System.out.println(studentLee.address); //일산동구
		
		//3. getter&setter 초기화 studentPark
		StudentInfo studentPark = new StudentInfo();
		studentPark.setStudentName("고예림");
		System.out.println(studentPark.getStudentName());
		
		
		
	}

}
