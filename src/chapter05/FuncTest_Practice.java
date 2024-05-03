package chapter05;

public class FuncTest_Practice {
	
		static int add(int a, int b) {
			int x = a+b;
			return x;
		}
		
		static double add(double a, double b) {
			double x = a+b;
			return x;
		}
		
	public static void main(String[] args) {
		int sum =add(5,10);
		double sumDouble=add(3.5,7.2);
		
		System.out.println("합계(int) : "+sum);
		System.out.println("합계(double) : "+sumDouble);
		
		
	}
		
	

}
