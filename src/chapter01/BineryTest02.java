package chapter01;

public class BineryTest02 {

	public static void main(String[] args) {
		// ī����(�� ����) : ù�ڴ� ������ �ҹ���, �߰��ܾ��� ù�ڸ� �빮�ڷ� ����
		// �Ľ�Į��� : ù�ڴ� ������ �빮��(Ŭ�� ���̶� ������ �򰥸��� ������ ���� ����Ѵ�)
		
		int num=10;
		int bNum=0B1000; //Binary �� 2����(0,1)
		int oNum=010; //8����(OCT)
		
		System.out.println("10���� : "+num);
		System.out.println("2���� : "+bNum);
		System.out.println("8���� : "+bNum);
		System.out.println("-------------------------");
		
		int bNum2=0B10000;
		int hNum=0x10; //16����(Hex)
		System.out.println("2���� : "+bNum2);
		System.out.println("16���� : "+hNum);
		
	}


}
