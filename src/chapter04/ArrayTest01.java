package chapter04;

public class ArrayTest01 {

	public static void main(String[] args) {
		// ���� ���
		int number1[]=new int[10];
		int[] number2=new int[10];
		
		int number3[];
		number3=new int[10];
		
		//�ʱ�ȭ
		//int number4[]=new int[] {1,2,3,4,5,6,7,8,9,10} ;
		int[] number4= {1,2,3,4,5,6,7,8,9,10};
		int number5[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<number3.length;i++) {
			System.out.println(number3[i]= (i+1) );
			
		}
		
		
	}

}
