package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		//1. ������� ���� �ʱ�ȭ studentKim
		StudentInfo studentKim = new StudentInfo();
		System.out.println(studentKim.address); //null
		studentKim.studentID=1000;
		studentKim.grade=4;
		studentKim.address="������";
		System.out.println(studentKim.address); 
		
		
		//2. �����ڸ� ���� �ʱ�ȭ studentLee
		StudentInfo studentLee = new StudentInfo(1004, "�鼳", 1, "�ϻ굿��");
		System.out.println(studentLee.address); //�ϻ굿��
		
		//3. getter&setter �ʱ�ȭ studentPark
		StudentInfo studentPark = new StudentInfo();
		studentPark.setStudentName("����");
		System.out.println(studentPark.getStudentName());
		
		
		
	}

}
