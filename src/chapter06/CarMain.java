package chapter06;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("����ȸ��:"+car.Company);
		System.out.println("�𵨺�:"+car.model);
		System.out.println("����:"+car.Color);
		System.out.println("�ְ�ӵ�:"+car.maxSpeed);
		car.speed(0, 60);
		
		/*
		System.out.println("����ȸ��:"+car.Company);
		System.out.println("�𵨺�:"+car.model);
		System.out.println("����:"+car.Color);
		System.out.println("�ְ�ӵ�:"+car.maxSpeed);
		car.speed=60;
		System.out.println("����� �ְ�ӵ�:"+car.maxSpeed);
		*/
		
		
		/*
		����ȸ��:���
		�𵨸�:k5
		����:���
		�ְ�ӵ�:280
		����ӵ�:0
		����� ����ӵ�:60
		*/
		
		
	}

}
