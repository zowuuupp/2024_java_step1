package chapter02;

public class LogicalTest01 {

	public static void main(String[] args) {
		// �� ������
		
		char a,b;
		boolean c;
		
		a='A'; //65
		b='B'; //66
		
		c=(true||true) && false; // T && F
		System.out.println(c); // F
		
		c=a<b && (a==b); // T && F
		System.out.println(c); // F
		System.out.println("===============");
		c=a<b||(a==b); // T||F
		System.out.println(c); // T 
		
	    
		
		
		

	}

}
