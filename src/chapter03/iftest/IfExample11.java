package chapter03.iftest;

import java.util.Scanner;

public class IfExample11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 : ");
		String ID=scan.nextLine();

		
		if (ID.equals("admin")) { //ID가 일치 했을때 
			System.out.print("비밀번호 : "); //비번을 입력하게 하는데
			int pass = Integer.parseInt(scan.nextLine()); // 그 비번을 int로 변환시켜주며
			if (pass==240219) { //패스워드 일치 확인을 한다.
			System.out.println(ID+"님 환영합니다.");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		}
		else {
		    System.out.println("관리자 ID로 접속하여 주세요.");
			
		}//if
		
		
		

	}//main

}
