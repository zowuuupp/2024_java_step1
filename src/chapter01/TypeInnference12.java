package chapter01;

public class TypeInnference12 {

	public static void main(String[] args) {
		// var(������ ��������): ������ ���¸� ���� �˾Ƽ� �Ǵ��Ͽ� Ÿ�� ����
		int i=10;  // ������ int �� ��� �ϴµ� ���� ��� var�� ���� �˾Ƽ� Ÿ���� �����Ѵ�.
		
		var n=5;
		var j=10.0; //double�� ���� �޾Ƶ��̴� �����̴�.
		var str="Test Good"; //String
		
		System.out.println(i);
		System.out.println(n);
		System.out.println(j);
		System.out.println(str);

	}

}
