package chapter05;

public class FuncTest03 {

	public static void swap(int x, int y) {
		
		int temp=x; //x�� temp��
		       x=y; //y�� x��
		    y=temp; //temp�� y��... �ᱹ ���� ��ü�� �Ǵ� �˰����̴�.
		    
		    System.out.println("swap()����� : x="+x+", y="+y);
		    
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("swap() ȣ�� �� : a="+a+", b="+b);
		System.out.println("==============================");
		
		swap(a,b);
		
		System.out.println("==============================");
		System.out.println("swap() ȣ�� �� : a="+a+", b="+b);
		
	}

}
