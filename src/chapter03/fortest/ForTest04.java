package chapter03.fortest;

public class ForTest04 {

	public static void main(String[] args) {
		System.out.println("===0���� 100������ �� �� Ȧ���� ���� ���===");
		
		int num;
		int total=0;
		
		for(num=0; num<=100 ; num++) {
			
			if(num%2==0) {
				continue; // �����ϼ���
			}
			System.out.print(num+" ");
			total+=num;
			
		}
		System.out.println(" ");
		System.out.println("0���� 100������ �� �� Ȧ���� �� : "+total);
		
		System.out.println("========================");
		System.out.println("1���� 20������ �� �� Ȧ���� ���");
		
		int i;
		
		for(i=1; i<=20 ; i++) {
			if (i%2==1) {
				
				System.out.print(i+" ");
			}
			
			
		}
		
		
		

	}

}
