package chapter03.whiletest;

public class WhileExample02 {

	public static void main(String[] args) {
		// 팩토리얼 알고리즘
		/*
		 * 5! -> 5*4*3*2*1 => n! -> n*(n-1)*(n-2)*.....*1
		 */
		
		int number=5;
		int factorial=1;
		
		//숫자가 0이 아닐 때까지 반복하는 팩토리얼 계산
		while ( number>0) {
			factorial *= number;
			number--;
		}
		
		System.out.println("팩토리얼 결과 : "+factorial);
	}

}
