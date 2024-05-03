package chapter01;

public class BineryTest02 {

	public static void main(String[] args) {
		// 카멜기법(빈도 높음) : 첫자는 무조건 소문자, 중간단어의 첫자를 대문자로 선언
		// 파스칼기법 : 첫자는 무조건 대문자(클라스 명이랑 변수랑 헷갈리기 때문에 적게 사용한다)
		
		int num=10;
		int bNum=0B1000; //Binary 즉 2진수(0,1)
		int oNum=010; //8진수(OCT)
		
		System.out.println("10진수 : "+num);
		System.out.println("2진수 : "+bNum);
		System.out.println("8진수 : "+bNum);
		System.out.println("-------------------------");
		
		int bNum2=0B10000;
		int hNum=0x10; //16진수(Hex)
		System.out.println("2진수 : "+bNum2);
		System.out.println("16진수 : "+hNum);
		
	}


}
