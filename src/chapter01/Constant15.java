package chapter01;

public class Constant15 {

	public static void main(String[] args) {
		// 상수 : 변하지 않는 값
		
		final int MAX_NUM=100; // 상수의 경우 이름을 전부 대문자로 해준다. 정확한 용어 로 초기화
		final int MIN_NUM;// 선언 이라 한다.
		final double PI=3.14;
		
		MIN_NUM=0; // 리터널 값
        //PI=3.141592; // 리터널 값
		
		//위에 MIN_NUM=0; 은 오류가 안 뜨지만 그 밑에는 오류가 뜬다. 리터널값 변경시 final이 선언되어 있어 ERROR
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(PI);
		
		
		
	}

}
