package chapter04;

public class ArrayExample03 {

	public static void main(String[] args) {
		//�迭���� �ִ밪�� ã�Ƽ� ���
		
		int max=0;
		int array[]= {1,6,8,2,35,178,234,4,5,11};
		
		//for������ if������ ������ ũ�⸦ ���ؼ�
		//max���� 0�� �迭���� ������ ���� max=array[i];
	
		//���1
		for (int i=0; i<array.length;i++) {
			
			if(array[i]>max) {
				
				max=array[i];
			}
		}
		System.out.println("�迭������ �ִ밪 : "+max+" �Դϴ�.");
		
		
		/* ���2 (Ȯ��for��)
		for (int num : array) {
			
			if(num > max) {
				
				max = num;
			}
		}
		System.out.println("�迭������ �ִ밪 : "+max+" �Դϴ�.");
		
		*/
		
		
	}

}
