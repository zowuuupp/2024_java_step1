package chapter03.whiletest;

public class WhileTest01 {

	public static void main(String[] args) {
		while(true) {
			int num=(int)(Math.random()*6)+1;
			System.out.println("주사위의 눈 : "+num);
			if(num==6) {
				break;
			}
			
		}//while
		System.out.println("프로그램 종료");
		
		
		
	}

}
