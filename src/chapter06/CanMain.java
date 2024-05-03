package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		String select="";
		int money=0;
		
		Vending ven = new Vending();
		
		ven.init(); //음료 준비완료
		
		Scanner scan = new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.print("돈을 투입하세요 : ");
			money=scan.nextInt(); //돈 투입
			ven.showCans(money);//1100
			System.out.println("==============");
			System.out.print("음료를 선택하세요 : ");
			select=scan.next(); //nextLine은 Space Enter를 문자를 인식한다. 그래서 여기서 콜라 하고 Enter를 하면 끝! 내는거다.
			ven.outCan(select);
			
		}
		
	}
	//만들어 내는 흐름 스스로 생각한거 적은거
	/* 자판기에 돈을 넣고 음료수를 뽑아 먹으려고 하는데 음료수의 종류는 5가지이다.
	 * 1.캔 종류에 따른 이름과 금액을 표시한다. 배열을 사용하면 펼할 것 같다.
	 * 2.그러기 위해서는 캔에 대한 이름과 가격에 대한 멤버변수가 필요하다. 생성값을 쓰면 편할듯 하다.
	 * 자판기에 돈을 넣는다. 그 금액에 가능한 음료수가 골라진다.
	 * 1.자판기에 돈을 넣고 가능한 음료수가 표시 되는 메소드를 만들자.
	 * 2.메인에 메소드를 활용해서 판별하자.
	 * 가능한 음료수를 선택한다. 선택하면 음료수가 나오고 남은 금액이 표시된다.
	 * 1.위에서 돈에 따른 음료수가 정해졌고 그럴 표시 하였다.
	 * 2.그러므로 음료수를 입력해서 이름이 같은 것을 고르고 금액에서 차감한다.
	 * 
	 */
	

}
