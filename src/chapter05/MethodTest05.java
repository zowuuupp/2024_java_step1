package chapter05;

public class MethodTest05 {
	
	static int add (int a, int b) {
		int x=a+b;
		return x;
	}
	static int subtract (int a, int b) {
		int x=a-b;
		return x;
	}
	static int multiply (int a, int b) {
		int x=a*b;
		return x;
	}
	static double divide (double a, double b) {
		double x=a/b;
		return x;
	}

	public static void main(String[] args) {
		System.out.println(add(5,3));
		System.out.println(subtract(10,4));
		System.out.println(multiply(6,7));
		System.out.println(divide(20.4,4.0));
		
		
	}

}
