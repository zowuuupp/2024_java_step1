package chapter03.fortest;

public class ForTest01 {

	public static void main(String[] args) {
		// 1���� 10���� ��
		
		int sum=1;
		/*
		System.out.println(++sum); //2
		System.out.println(sum++); //2
		System.out.println(sum++); //3
		*/
		sum+=2; //sum=sum+2
		sum+=3;
		sum+=4;
		sum+=5;
		sum+=6;
		sum+=7;
		sum+=8;
		sum+=9;
		sum+=10;

		System.out.println(sum);
		
		System.out.println("===============");
		
		int i;
		System.out.println("1���� 10������ �� ���");
		for(i=0; i<10 ; i++) { //0���� �����̸� ��� ������ 10�� �����Ѵٴ� �ǹ��̴�.
			System.out.print((i+1) + " ");
		}
			
		int j;
		int sum2=0; //������������ �ݵ�� �ʱ�ȭ, �ƹ��͵� ���� �ſ� ���ϱ⸦ ������ �� ����.
		System.out.println("1���� 10������ �� ���");
		for(j=1; j<=10; j++) { // 1���� �����ϸ� ��� ������ 10���� ���� �����Ѵٴ� �ǹ��̴�.
			sum2+=j;
		}
		System.out.println();
		System.out.println("1���� 10������ �� : "+sum2);
		
		
		
	}

}
