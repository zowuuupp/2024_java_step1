package chapter01;

public class TypeInnference12 {

	public static void main(String[] args) {
		// var(참조형 변수선언): 데이터 형태를 보고 알아서 판단하여 타입 지정
		int i=10;  // 원래는 int 를 써야 하는데 밑의 경우 var를 쓰면 알아서 타입을 지정한다.
		
		var n=5;
		var j=10.0; //double이 보통 받아들이는 형태이다.
		var str="Test Good"; //String
		
		System.out.println(i);
		System.out.println(n);
		System.out.println(j);
		System.out.println(str);

	}

}
