package chapter05;

public class FuncTest_OverloadMain {

	public static void main(String[] args) {
		
		FuncTest_Overload obj = new FuncTest_Overload(); //FuncTest_Overload() 클래스 공간으로 assignment 해주겠다는 거다. obj 안에 FuncTest_Overload 클래스가 들어가는 것.
		
		int a=10; //타입
		
		obj.getResult(4);
		obj.getResult('A');
		obj.getResult("월요일 입니다.");
		obj.getResult(3,"2024"); //매개변수만 다르게 해서 참조하는 거다.
		
	}

}

