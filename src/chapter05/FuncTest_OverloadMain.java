package chapter05;

public class FuncTest_OverloadMain {

	public static void main(String[] args) {
		
		FuncTest_Overload obj = new FuncTest_Overload(); //FuncTest_Overload() Ŭ���� �������� assignment ���ְڴٴ� �Ŵ�. obj �ȿ� FuncTest_Overload Ŭ������ ���� ��.
		
		int a=10; //Ÿ��
		
		obj.getResult(4);
		obj.getResult('A');
		obj.getResult("������ �Դϴ�.");
		obj.getResult(3,"2024"); //�Ű������� �ٸ��� �ؼ� �����ϴ� �Ŵ�.
		
	}

}

