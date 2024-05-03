package chapter06;

public class Vending {
	
	//멤버변수
	private Can[] can = new Can[5];
	private int money;
	
	//메소드
	public void init() {
		can[0]=new Can("환타", 1000);
		can[1]=new Can("제로콜라", 1200);
		can[2]=new Can("사이다", 1100);
		can[3]=new Can("콜라", 1100);
		can[4]=new Can("레드불", 2000);
	}
	
	//사용 가능한 음료만 보여주기(예로 1100원을 자판기에 넣으면 가능한 음료만 불이 켜지는 그런거)
	public void showCans(int m) {
		money+=m;
		for (int i=0; i<can.length;i++) {
			if(money>=can[i].getPrice()) {
				System.out.println(can[i].getCanName()+"-"+can[i].getPrice()+"원");
			}
			
		}
	}//메소드
	
	//선택한 음료수 제공과 잔액 출력
	public void outCan(String name) {
		for (int i=0;i<can.length;i++) {
			if(name.equals(can[i].getCanName())) {
				System.out.println("주문하신 "+can[i].getCanName()+"를(을) 내보냈습니다.");
				money=money-can[i].getPrice();
				System.out.println("남은 잔액은 : "+money+"원 입니다.");
			}
		}
	}
	
	

}
