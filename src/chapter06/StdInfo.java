package chapter06;

public class StdInfo {
	
	//�������=�ʵ�
	public String studentName;
	public int grade;
	public int money;
	
	//������ �����ε�(studenName, money)
	public StdInfo(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//����
	public void takeBus(Bus bus) { //�Ű������� Ŭ���� ������ ������ �� �ִ�.
		bus.take(1000);
		this.money-=1000;//�л� ����
	}
	
	//����ö
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money-=1500; //�л� ����
	}
	
	//�ܾ�(���Ȯ��)
	public void showInfo() {
		System.out.println(studentName+"���� ���� �ܾ���: "+money+"�Դϴ�.");
	}
	
	

}
