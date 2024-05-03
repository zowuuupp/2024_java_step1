package chapter03.fortest;

public class ForTest08 {

	public static void main(String[] args) {
		// 1에서부터 100까지의 수 중에서 3의 배수를 찾아 합을 계산하세요.
		
		int num, sum=0;
		
		for (num=1 ; num<=100 ; num++) {
			if (num%3==0) {
				sum+=num;
				System.out.println("1~100까지의 수 중에서 3의 배수 : "+num);
			}
			
		}
		
		System.out.println("1부터 100까지의 수 중에서 3의 배수의 합 : "+sum);
				
		
		

	}

}
