package chapter06;

public class Cafe {
	
	//�������
	public String name;
	public int sales;

	//������
	public Cafe(String name) {
		this.name = name;
	}
	
	//�޼ҵ�
	public void sell(int amount) { //���� ���� �� ī���� ��������
		sales += amount;
	}
	public void showInfo() {
		System.out.println(name+"ī���� ������ "+sales+"�� �Դϴ�.");
	}
	

}
