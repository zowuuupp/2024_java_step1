package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		
		//�� 2�� ����(Kim 12000��/ Park 10000��)
		Customer Kim = new Customer("��Ŀ��", 12000);
		Customer Park = new Customer("��ī��", 10000);
		
		//ī�� ����(ī�� �̸� : ���� ���� Ŀ��)
		Cafe cafeA = new Cafe("���̳��� Ŀ��");
		
		//ī�� �湮(���� ���� Ŀ�ǿ� �湮 �ϴµ� Kim 4000/Park 4500�� ������ �湮)
		Kim.visitCafe(cafeA, 4000);
		Park.visitCafe(cafeA, 4500);
		
		//ī�� ���� Ȯ�� , �� ���� Ȯ��
		cafeA.showInfo();
		Kim.showInfo();
		Park.showInfo();
		
	}

}
