package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		
		//��ü����
		
		Start st = new Start();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			select=scan.nextInt();
			check=st.check(select);
			if(check.equals("SUCCESS")) {
				break;
			}
		}
		
		
		
		
	}

}
