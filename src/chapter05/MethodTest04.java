package chapter05;

public class MethodTest04 {
	
	static int add(int x, int y) {
		int s=x+y;
		return x+y;
	}
	
	static double add(double a,double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int sum = add(5,10);
		double sumDouble=add(3.5,7.2);
		
		System.out.println("합계(int) : "+sum);
		System.out.println("합계(double) : "+sumDouble);
		
		
	}

}
