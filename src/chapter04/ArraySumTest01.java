package chapter04;

public class ArraySumTest01 {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		int sum=0;
		
		/*for 이용해서 score점수 출력  => score[0] : 98
		 sum변수방에 점수 누적
		 */
		 
		
		for (int i=0; i<score.length;i++) {
			
			System.out.println("score["+i+"] : " + score[i]);
			sum+=score[i];
		}
		
		//sum 총점
		System.out.println("점수 누적 합 : "+sum);
		//avg 평균을 구현 후 출력(단, avg는 실수)
		double avg = (double)sum / score.length ;
		System.out.println("점수의 평균 : "+avg);
		//반올림
		double avgR = Math.round(avg);
		System.out.println(avgR);
		double avgR3 = Math.round(avg*1000.0)/1000.0;
		System.out.println(avgR3);
	}

}
