package chapter03.fortest;

public class ForTest02 {

	public static void main(String[] args) {
		System.out.println("1���� 100������ ���� ���");
		
		int i;
		int sum=0;
		
		for(i=0; i<100 ; i++) {
			System.out.println((i+1)+" ");
			sum+=(i+1);
		}
		System.out.println("1���� 100������ �� : "+sum+"�Դϴ�.");
		
		/*
		for(i=1 ; i<=100 ; i++) {
			System.out.print(i + " ");
			sum+=i;
		}
		*/
	}

}
