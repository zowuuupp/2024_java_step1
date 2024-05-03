package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// Scanner 클래스의 인스턴스 변수 sc에 값을 입력받음
		
		//등급 물어보기
		
		// A, a -> 최우수고객
		// B, b -> 우수고객
		// 나머지 -> 일반고객
		// charAt(0) : String -> char
		
		Scanner sc = new Scanner(System.in);
		System.out.print("회원님의 등급은 어떻게 되시나요? : ");
		char grade = sc.nextLine().charAt(0); // String은 최상위 포식자. char로 바꾸기 위해서는 앞에 캐스팅 하는것이 아니라 뒤에 .charAt를 쳐준다. // A,a,B,b....
		String dev;
		
		switch (grade) {
		case 'A': case 'a': {
			dev="최우수 고객";
			break;
		}
		case 'B': case 'b': {
			dev="우수 고객";
			break;
		}
		
		default: 
			dev="일반 고객";
			break;
		}
		
		System.out.println(grade+"등급이므로 회원님은 "+dev+"입니다.");
		
		
	}

}
