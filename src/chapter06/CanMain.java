package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		String select="";
		int money=0;
		
		Vending ven = new Vending();
		
		ven.init(); //���� �غ�Ϸ�
		
		Scanner scan = new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.print("���� �����ϼ��� : ");
			money=scan.nextInt(); //�� ����
			ven.showCans(money);//1100
			System.out.println("==============");
			System.out.print("���Ḧ �����ϼ��� : ");
			select=scan.next(); //nextLine�� Space Enter�� ���ڸ� �ν��Ѵ�. �׷��� ���⼭ �ݶ� �ϰ� Enter�� �ϸ� ��! ���°Ŵ�.
			ven.outCan(select);
			
		}
		
	}
	//����� ���� �帧 ������ �����Ѱ� ������
	/* ���Ǳ⿡ ���� �ְ� ������� �̾� �������� �ϴµ� ������� ������ 5�����̴�.
	 * 1.ĵ ������ ���� �̸��� �ݾ��� ǥ���Ѵ�. �迭�� ����ϸ� ���� �� ����.
	 * 2.�׷��� ���ؼ��� ĵ�� ���� �̸��� ���ݿ� ���� ��������� �ʿ��ϴ�. �������� ���� ���ҵ� �ϴ�.
	 * ���Ǳ⿡ ���� �ִ´�. �� �ݾ׿� ������ ������� �������.
	 * 1.���Ǳ⿡ ���� �ְ� ������ ������� ǥ�� �Ǵ� �޼ҵ带 ������.
	 * 2.���ο� �޼ҵ带 Ȱ���ؼ� �Ǻ�����.
	 * ������ ������� �����Ѵ�. �����ϸ� ������� ������ ���� �ݾ��� ǥ�õȴ�.
	 * 1.������ ���� ���� ������� �������� �׷� ǥ�� �Ͽ���.
	 * 2.�׷��Ƿ� ������� �Է��ؼ� �̸��� ���� ���� ���� �ݾ׿��� �����Ѵ�.
	 * 
	 */
	

}
