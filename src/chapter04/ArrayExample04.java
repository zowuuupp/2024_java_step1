package chapter04;

import java.util.Scanner;

public class ArrayExample04 {

	public static void main(String[] args) {
		//����ڿ��� �ε����� �˰���� ���ڸ� 1�������� 10���� �Է� �޾�,
		//�ش� ������ �ε����� ã�� ����ϴ� ���α׷��� ���弼��.
		//��, ����ڰ� �Է��� ���� �迭 �ε����� ��Ÿ�� �� ���� ��� ã�� �� ���ٴ� ������ ����ϼ���.
						
		int[] numbers = { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6};
		int target;
		int index =-1; 
				
		//�迭 ������ ã�� ������ ��� �ʱ�ȭ.
		Scanner scan = new Scanner(System.in);
		System.out.print("�ε����� �˰���� ���ڸ� 1���� 10���̷� �Է��ϼ���. : ");
		target = scan.nextInt();
				
		for (int i=0; i<numbers.length;i++) {
					
			if ( target == numbers[i]) {
						
				index=i;
				break;
			} 
		}
		if (index != -1) {
			
			System.out.println(target+"��(��) "+index+"��° �ִ�.");
		} else {
			
			System.out.println("ã�� �� �����ϴ�.");
		}

	}

}
