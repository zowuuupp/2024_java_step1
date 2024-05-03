package chapter03.iftest;

public class IfExample06 {

	public static void main(String[] args) {
		// 1점 ~ 6점까지 받을 수 있음. 각 점수당 분식 쏘기(점수는 랜덤으로 받기)
		int num=(int)(Math.random()*6)+1;    // *6은 6번 돈다는 뜻. 그런데 0 1 2 3 4 5 이기 때문에 +1을 전체적으로 다 해준다.
		
		if (num==1) {
			System.out.println("1점 -> 순대");
		}else if (num==2) {
			System.out.println("2점 -> 오징어튀김");
		}else if (num==3) {
			System.out.println("3점 -> 어묵");
		}else if (num==4) {
			System.out.println("4점 -> 김말이튀김");
		}else if (num==5) {
			System.out.println("5점 -> 김밥");
		}else {
			System.out.println("6점 -> 떡볶이");
		}
		
		
		
		

	}//main

}//class
