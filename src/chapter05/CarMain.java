package chapter05;

public class CarMain {

	public static void main(String[] args) {
		
		Car mycar = new Car(); //heap �޸� ����ؼ� ����. Ŭ������ �����°�.
		mycar.carName="���K5";
		mycar.carColor="�Ͼ��";
		
		System.out.println("������� ��� : "+mycar.carName);
		System.out.println("�޼��� ��� : "+mycar.getCarName());
		
		//��������� �̿��� �÷����
		//�޼��带 �̿��� �÷����
		
		System.out.println("===========================");
		System.out.println("������� ��� : "+mycar.carColor);
		System.out.print("�޼��� ��� : ");
		mycar.showCarInfo();
		
		
	}

}
