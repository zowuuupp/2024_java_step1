package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {
		int time= (int)(Math.random()*10)+9;
		System.out.println("[현재시간: " + time +"시]");
		System.out.print("할 일 : ");
		
		switch (time) {
		case 9: case 10: {
			System.out.println("늦잠자기");
			break;
		}
		case 11: {
			System.out.println("멍 때리기");
			break;
		}
		case 12: case 13: {
			System.out.println("점심 먹기");
			break;
		}
		case 14: case 15: case 16: case 17: {
			System.out.println("자유시간 갖기");
			break;
		}
		case 18: case 19: {
			System.out.println("저녁 먹기");
			break;
		}
		default:
			System.out.println("시간을 잘못 입력하셨습니다.");
		}
		
	}

}
