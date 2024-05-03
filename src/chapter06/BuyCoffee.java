package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		
		//고객 2명 생성(Kim 12000원/ Park 10000원)
		Customer Kim = new Customer("김커피", 12000);
		Customer Park = new Customer("박카페", 10000);
		
		//카페 생성(카페 이름 : 힘이 나는 커피)
		Cafe cafeA = new Cafe("힘이나는 커피");
		
		//카페 방문(힘이 나는 커피에 방문 하는데 Kim 4000/Park 4500을 가지고 방문)
		Kim.visitCafe(cafeA, 4000);
		Park.visitCafe(cafeA, 4500);
		
		//카페 정보 확인 , 고객 정보 확인
		cafeA.showInfo();
		Kim.showInfo();
		Park.showInfo();
		
	}

}
