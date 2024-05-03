package chapter01;

public class DoubleEx06 {

	public static void main(String[] args) {
		// Number : bit -> byte -> short -> int(4byte) -> long
		// 실수 : float(4byte) -> double(8byte)
		// 문자 : char('')
		// 문자열 : String(" ")
		
		float fnum=3.14f; //4바이트
		double dnum=3.14; //8바이트
        // 주로 double을 쓴다. long처럼 얘도 줄었다 늘었다 한다. 
		//그래서 확정적인 값에 float를 쓰고 나머지는 double을 쓴다. 
		//뒤에 붙이는 게 없어서 double을 더 많이 쓴다.
		
		System.out.println(fnum);
		System.out.println(dnum);
		
		
	}

}
