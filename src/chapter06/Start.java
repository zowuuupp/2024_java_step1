package chapter06;

import java.util.Random;

public class Start {
	
	private int pcnum = new Random().nextInt(50)+1; //1~50 정수 랜덤 추출
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		count++;
		//random값보다 작으면 up, 크면 down, 일치하면 result="SUCCESS"
		
		if (pcnum>mynumber) {
			System.out.println("입력하신 값이 작습니다. 값을 Up.");
		}
		else if (pcnum<mynumber) {
			System.out.println("입력하신 값이 큽니다. 값 Down.");
		}
		else {
			result="SUCCESS";
			System.out.println(count+"회 만에 정답!");
		}
		return result;
	}
	
	

}
