package chapter03.fortest;

public class ForTest08 {

	public static void main(String[] args) {
		// 1�������� 100������ �� �߿��� 3�� ����� ã�� ���� ����ϼ���.
		
		int num, sum=0;
		
		for (num=1 ; num<=100 ; num++) {
			if (num%3==0) {
				sum+=num;
				System.out.println("1~100������ �� �߿��� 3�� ��� : "+num);
			}
			
		}
		
		System.out.println("1���� 100������ �� �߿��� 3�� ����� �� : "+sum);
				
		
		

	}

}
