package chapter06;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("제작회사:"+car.Company);
		System.out.println("모델병:"+car.model);
		System.out.println("색깔:"+car.Color);
		System.out.println("최고속도:"+car.maxSpeed);
		car.speed(0, 60);
		
		/*
		System.out.println("제작회사:"+car.Company);
		System.out.println("모델병:"+car.model);
		System.out.println("색깔:"+car.Color);
		System.out.println("최고속도:"+car.maxSpeed);
		car.speed=60;
		System.out.println("변경된 최고속도:"+car.maxSpeed);
		*/
		
		
		/*
		제작회사:기아
		모델명:k5
		색깔:흰색
		최고속도:280
		현재속도:0
		변경된 현재속도:60
		*/
		
		
	}

}
