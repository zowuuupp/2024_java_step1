package chapter06;

public class Vending {
	
	//�������
	private Can[] can = new Can[5];
	private int money;
	
	//�޼ҵ�
	public void init() {
		can[0]=new Can("ȯŸ", 1000);
		can[1]=new Can("�����ݶ�", 1200);
		can[2]=new Can("���̴�", 1100);
		can[3]=new Can("�ݶ�", 1100);
		can[4]=new Can("�����", 2000);
	}
	
	//��� ������ ���Ḹ �����ֱ�(���� 1100���� ���Ǳ⿡ ������ ������ ���Ḹ ���� ������ �׷���)
	public void showCans(int m) {
		money+=m;
		for (int i=0; i<can.length;i++) {
			if(money>=can[i].getPrice()) {
				System.out.println(can[i].getCanName()+"-"+can[i].getPrice()+"��");
			}
			
		}
	}//�޼ҵ�
	
	//������ ����� ������ �ܾ� ���
	public void outCan(String name) {
		for (int i=0;i<can.length;i++) {
			if(name.equals(can[i].getCanName())) {
				System.out.println("�ֹ��Ͻ� "+can[i].getCanName()+"��(��) �����½��ϴ�.");
				money=money-can[i].getPrice();
				System.out.println("���� �ܾ��� : "+money+"�� �Դϴ�.");
			}
		}
	}
	
	

}
