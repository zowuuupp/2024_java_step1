package chapter06;

public class Subway {
	
	//멤버변수
	public String lineNumber;
	public int passengerCount;
	public int money;
	
	//오버로딩 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { //승객이 낸 돈
		this.money+=money; //버스 수입 증가
		passengerCount++; //승객수
	}
	public void showInfo() {
		System.out.println("지하철 "+lineNumber+"번의 승객은 "+passengerCount+"명 입니다. 수입은 "+money+"원 입니다.");
	}

}
