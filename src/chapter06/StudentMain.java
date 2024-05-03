package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		
		//멤버변수 활용하여 초기화(이름,주소)
		Student student1 = new Student();
		student1.studentName="이석준";
		student1.address="도봉구";
		student1.showStudentInfo();
		
		//생성자를 이용하여 초기화(student2)(이름,주소)
		Student student2 = new Student("이석준2", "도봉구2");
		student2.showStudentInfo();
		
		//get,set 메소드 활용 (우클릭 source -> getters and setters)
		Student student3= new Student();
		student3.setStudentName("솔데스크");
		student3.setAddress("종로구");
		System.out.println(student3.getStudentName());
		System.out.println(student3.getAddress());
		
	}

}
