package chapter05;

public class FuncTest06 { //FuncTest05 ���� �� �߰��� �ϴ°�.
	
		//�������=�ʵ� (this�� ���Կ���)
		public String channel;
		public int channelInt;		
		public int volume;
		
		//������ ����(����Ʈ �������̱� ������ �ڵ� ����)
		
		//�޼ҵ�
		public int channelUp(int volume) {
			this.volume = volume; // ��ġ ���� ������� public int volume =5; �� ����ϴ� ���̴�? �̰� ��� ������� �Ȱ��� ���´�. �㳪 �ٸ� ����� ����� ���Կ����� �ϴ°Ŵ�?
			System.out.println("�Ҹ��� ���̰ڽ��ϴ�.");
			return volume+2;
			
		}
		public void channelDown(int volume) {
			this.volume=volume;
			System.out.println("�Ҹ��� �����ڽ��ϴ�.");
			System.out.println("�Ҹ��� "+volume+"��ŭ �����ϴ�.");
			
		}
		
		public static void main(String[] args) {
			
			FuncTest06 tv=new FuncTest06();
			int a=5;
			int b=9;
			System.out.println("�Ҹ��� "+tv.channelUp(a)+"��ŭ �ø��ϴ�.");
			System.out.println("===========================");
			int volume1=tv.channelUp(b);
			System.out.println("�Ҹ��� "+volume1+"��ŭ �ø��ϴ�.");
			//void �޼ҵ� ȣ��
			tv.channelDown(b);
			
		}
		
		
		
		
}


