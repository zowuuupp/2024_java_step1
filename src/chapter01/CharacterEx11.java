package chapter01;

public class CharacterEx11 {

	public static void main(String[] args) {
		//A:65 / a:97   , B:66
		
		int a=65;
		System.out.println(a);
		System.out.println(a+10);
		
		
		System.out.println("-----------------");
		// 명시적 형변환 int -> char (long 에서 int로 가는 건 묵시적 형변환)
		System.out.println((char)a); // 아스키 코드 ( 숫자인데 문자라고 약속되어 있는거, int를 char로 변환)
		System.out.println("-----------------");
		
		int b=66;
		System.out.println(b);
		System.out.println((char)b);
		System.out.println("-----------------");
		
		int a2=97;
		System.out.println(a2);
		System.out.println((char)a2);
		System.out.println("-----------------");
		
		int b2=70;
		System.out.println(b2);
		System.out.println((char)b2);
		
		
		
		
		
	}

}
