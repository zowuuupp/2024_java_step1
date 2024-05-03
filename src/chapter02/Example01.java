package chapter02;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 534개의 책을 학생 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기
				
		int books=534;
		int students=30;
		
		//학생당 한 명이 가지는 책의 수
		int booksPerStudents = (books/students);
		System.out.println("학생당 한 명이 가지는 책의 수 : "+booksPerStudents);
		//남은 책의 수
		int bookLeft=(books & students);
		System.out.println("남은 책의 수 : "+bookLeft);
		
		//번외 스캐너로 혼자 해보기
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("책의 수 : "); // 여기서 println을 print 로 바꿔주는 이유는 입력란에서 입력커서가 글자 앞으로 가는 게 아니라 뒤로 가게 하기 위해서 인 것 같다.
		int num1=scanner.nextInt();
		System.out.print("학생 수 : ");
		int num2=scanner.nextInt();
		
		System.out.println("학생당 한 명이 가지는 책의 수 : "+(num1/num2));
		System.out.println("남은 책의 수 : "+(num1%num2));
		
		
		

	}

}
