package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {
		int time= (int)(Math.random()*10)+9;
		System.out.println("[����ð�: " + time +"��]");
		System.out.print("�� �� : ");
		
		switch (time) {
		case 9: case 10: {
			System.out.println("�����ڱ�");
			break;
		}
		case 11: {
			System.out.println("�� ������");
			break;
		}
		case 12: case 13: {
			System.out.println("���� �Ա�");
			break;
		}
		case 14: case 15: case 16: case 17: {
			System.out.println("�����ð� ����");
			break;
		}
		case 18: case 19: {
			System.out.println("���� �Ա�");
			break;
		}
		default:
			System.out.println("�ð��� �߸� �Է��ϼ̽��ϴ�.");
		}
		
	}

}
