package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		
		//������� Ȱ���Ͽ� �ʱ�ȭ(�̸�,�ּ�)
		Student student1 = new Student();
		student1.studentName="�̼���";
		student1.address="������";
		student1.showStudentInfo();
		
		//�����ڸ� �̿��Ͽ� �ʱ�ȭ(student2)(�̸�,�ּ�)
		Student student2 = new Student("�̼���2", "������2");
		student2.showStudentInfo();
		
		//get,set �޼ҵ� Ȱ�� (��Ŭ�� source -> getters and setters)
		Student student3= new Student();
		student3.setStudentName("�ֵ���ũ");
		student3.setAddress("���α�");
		System.out.println(student3.getStudentName());
		System.out.println(student3.getAddress());
		
	}

}
