package chapter06;

public class Customer {
	
	//�������
	public String customerName;
	public int money;
	
	//������
	public Customer(String customerName, int money) {
		this.customerName = customerName;
		this.money = money;
	}
	
	//�޼ҵ�
	public void visitCafe(Cafe cafe, int amount) {
		cafe.sell(amount);
		this.money-=amount;
	}
	public void showInfo() {
		System.out.println(customerName+"���� �ܾ��� : "+money+"�� �Դϴ�.");
	}
	
	

}
