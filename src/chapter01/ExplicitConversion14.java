package chapter01;

public class ExplicitConversion14 {

	public static void main(String[] args) {
		
		//캐스팅 문법(명시적 형변환)
		int iNum=1000;
		byte bNum=(byte)iNum; // -128 ~ 127 (0을 제외, 0을 양수취급한다)
		
		System.out.println(iNum);
		System.out.println(bNum); // 유실된 결과값(손실). (byte)를 붙여서 어거지로 성립하게 했어도 범위를 이미 초과했다. 그래서 값이 이상하게 나온다.
		System.out.println("--------------------------");
		
		double dNum1=1.2;
		float fNum1=0.9f;
		
		int iNum2=(int)(dNum1+fNum1); // dNum1이 애초에 들어올 수 없다. 1.2+0.9 =>2
		int iNum3=(int)dNum1+(int)fNum1; // 1+0=1
		
		System.out.println(iNum2);
		System.out.println(iNum3);
		
		
		

	}

}
