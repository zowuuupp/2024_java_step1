package chapter03.switchtest;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		int ranking=5;
		char medalColor;
		
		
		// swi ġ�� ctrl �����̽�
		switch (ranking) {
		case 1: 
			medalColor='G';
			break;
		case 2: 
			medalColor='S';
			break;
		case 3: 
			medalColor='B';
			break;
			
		default:
			medalColor='A';
			
		}
		
		System.out.println(ranking+"���� �޴��� "+medalColor+"�Դϴ�.");
		
		
		
		

	}

}
