package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		// 전위연산(더한 후에 대입하라. 즉 ; 전에 더하고 나서 다음 과정을 행하는 것이다.)
		
		System.out.println("===전위연산===");
		
		int gameScore=150;
		// int lastScore1=gameScore+1;
		int lastScore1=++gameScore; // 1씩 더하는 것과 동일하다. 유일하게 1만 생략이 가능하다.
		System.out.println(gameScore);
		System.out.println(lastScore1); // gameScore => 151
		System.out.println("===============");
		int lastScore2=--gameScore; // int lastScore1=gameScore-1;
		System.out.println(gameScore);
		System.out.println(lastScore2);
		
		// 후위연산(대입을 한 후에 더하라, 즉 ; 이 후에 더한채로 진행하겠다는 의미이다.)
		System.out.println("===후위연산===");
		int lastScore3=gameScore++;
		System.out.println(lastScore3); // lastScore3 => 150
		System.out.println(gameScore); // gameScore => 151
		System.out.println("===============");
		int lastScore4=gameScore--;
		System.out.println(lastScore4); // lastScore4 => 151
		System.out.println(gameScore); // gameScore => 150
		
		

	}

}
