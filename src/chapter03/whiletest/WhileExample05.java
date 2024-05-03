package chapter03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class WhileExample05 {

	public static void main(String[] args) {
		
		/*숫자 맞추기 게임
		1부터 100까지 무작위 숫자를 선택하고, 숫자를 맞추는 게임
		만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 크면 "더 작은 숫자를 추측하세요" 출력
		만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 작으면 "더 큰 숫자를 추측하세요" 출력
		선택한 숫자를 정확히 맞출 때까지 과정을 반복
		맞출때까지 걸린 시도 횟수를 출력하여 축하의 메시지를 출력*/
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();  // 위에 import 가져오기는 ctrl shift o 이다
		int targetNumber = random.nextInt(100)+1; //컴퓨터 뽑은 숫자
		int guess;
		int count=0;
		
		System.out.println("1부터 100까지의 숫자를 맞춰보세요.");
		
		do {
			//사용자가 추측한 숫자 입력 받아서 카운트 하나씩 올리기
			System.out.print("추측 하시는 숫자를 입력해주세요 : ");
			guess = scan.nextInt();
			
			count++;
			//만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 크면 "더 작은 숫자를 추측하세요" 출력
			//만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 작으면 "더 큰 숫자를 추측하세요" 출력
			if(guess>targetNumber) {
				System.out.println("더 작은 숫자를 추측하세요");
				
			} else if (guess<targetNumber) {
				System.out.println("더 큰 숫자를 추측하세요");
				
			} 	
			
		} while (guess != targetNumber);
		System.out.println();
		System.out.println("축하합니다! "+count+"번 만에 맞추었습니다.");
		System.out.println("PC가 선택한 숫자 : "+targetNumber);
		System.out.println("User가 선택한 숫자 : "+guess);
	}

}
