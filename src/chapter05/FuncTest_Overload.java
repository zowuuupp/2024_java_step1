package chapter05;

public class FuncTest_Overload {
		
	//�������=�ʵ�
	
	//������(����Ʈ ����)
	public FuncTest_Overload() {
		
	}
	
	//�����ε�(�޼ҵ��� �Ű������� ������ ������ �ٸ��� �Ͽ� ǥ��)  , ����� �����̴�.
	public void getResult(int n) {
		System.out.println(n+"��(��) int �Դϴ�.");
	}
	public void getResult(String n) {
		System.out.println(n+"��(��) String �Դϴ�.");
	}
	public void getResult(char n) {
		System.out.println(n+"��(��) char �Դϴ�.");
	}
	public void getResult(int n,String str) {
		System.out.println(n+"��(��) int �̰� "+str+"��(��) String �Դϴ�.");
	}
	
	
}
