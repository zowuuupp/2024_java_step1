package chapter03.fortest;

public class ForTest01 {

	public static void main(String[] args) {
		// 1부터 10까지 합
		
		int sum=1;
		/*
		System.out.println(++sum); //2
		System.out.println(sum++); //2
		System.out.println(sum++); //3
		*/
		sum+=2; //sum=sum+2
		sum+=3;
		sum+=4;
		sum+=5;
		sum+=6;
		sum+=7;
		sum+=8;
		sum+=9;
		sum+=10;

		System.out.println(sum);
		
		System.out.println("===============");
		
		int i;
		System.out.println("1부터 10까지의 수 출력");
		for(i=0; i<10 ; i++) { //0부터 시작이면 가운데 조건은 10번 진행한다는 의미이다.
			System.out.print((i+1) + " ");
		}
			
		int j;
		int sum2=0; //누적변수방은 반드시 초기화, 아무것도 없는 거에 더하기를 실행할 수 없다.
		System.out.println("1부터 10까지의 수 출력");
		for(j=1; j<=10; j++) { // 1부터 시작하면 가운데 조건은 10이하 까지 실행한다는 의미이다.
			sum2+=j;
		}
		System.out.println();
		System.out.println("1부터 10까지의 합 : "+sum2);
		
		
		
	}

}
