package chapter05;

public class MethodTest03 {
	
	public static int add(int x, int y) {
		
		int a=x+y;
		return a;
	}

	public static void main(String[] args) {
		
		int result =add(5,7);
		System.out.println("Result : "+result);
		
	}

}
