package chapter05;

public class FuncTest05 {
	
	//�������=�ʵ�
	String channel; // public String channel; �̴�. public�� ������ �ִ°Ŵ�.
	int channelInt; // public int channelInt; �̴�. public�� ������ �ִ°Ŵ�.
	int volume; // public int volume; �̴�. public�� ������ �ִ°Ŵ�.
	
	public int channelUp(int volume) {
		
		System.out.println("�Ҹ��� ���̰ڽ��ϴ�.");
		return volume+2;
	}
	
	public void channelDown(int volume) {
		
		System.out.println("�Ҹ��� "+volume+"��ŭ �����ϴ�.");
		// return volume-2; void �־ return�� �Ұ�
	}
	
	public static void main(String[] args) {
		
		FuncTest05 tv=new FuncTest05();
		
		System.out.println("�Ҹ��� "+tv.channelUp(5)+"��ŭ �ø��ϴ�.");
		System.out.println("==================================");
		int volume=tv.channelUp(9); //2��° ���
		System.out.println("�Ҹ��� "+volume+"��ŭ �ø��ϴ�.");
		
		System.out.println();
		tv.channelDown(5);
		
		
		
	}

}
