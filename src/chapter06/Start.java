package chapter06;

import java.util.Random;

public class Start {
	
	private int pcnum = new Random().nextInt(50)+1; //1~50 ���� ���� ����
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		count++;
		//random������ ������ up, ũ�� down, ��ġ�ϸ� result="SUCCESS"
		
		if (pcnum>mynumber) {
			System.out.println("�Է��Ͻ� ���� �۽��ϴ�. ���� Up.");
		}
		else if (pcnum<mynumber) {
			System.out.println("�Է��Ͻ� ���� Ů�ϴ�. �� Down.");
		}
		else {
			result="SUCCESS";
			System.out.println(count+"ȸ ���� ����!");
		}
		return result;
	}
	
	

}
