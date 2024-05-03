package chapter05;

public class CarMain {

	public static void main(String[] args) {
		
		Car mycar = new Car(); //heap 메모리 사용해서 넣음. 클래스를 데려온것.
		mycar.carName="기아K5";
		mycar.carColor="하얀색";
		
		System.out.println("멤버변수 사용 : "+mycar.carName);
		System.out.println("메서드 사용 : "+mycar.getCarName());
		
		//멤버변수를 이용한 컬러출력
		//메서드를 이용한 컬러출력
		
		System.out.println("===========================");
		System.out.println("멤버변수 사용 : "+mycar.carColor);
		System.out.print("메서드 사용 : ");
		mycar.showCarInfo();
		
		
	}

}
