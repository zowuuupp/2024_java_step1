package chapter05;

public class FuncTest03 {

	public static void swap(int x, int y) {
		
		int temp=x; //x가 temp에
		       x=y; //y가 x에
		    y=temp; //temp가 y에... 결국 서로 교체가 되는 알고리즘이다.
		    
		    System.out.println("swap()결과값 : x="+x+", y="+y);
		    
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("swap() 호출 전 : a="+a+", b="+b);
		System.out.println("==============================");
		
		swap(a,b);
		
		System.out.println("==============================");
		System.out.println("swap() 호출 후 : a="+a+", b="+b);
		
	}

}
