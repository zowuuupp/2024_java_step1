package chapter05;

public class FuncExample02 {
	
	//�ִ밪 �޼ҵ�� ����
	public static int findMax(int[] arr) {
		int max=arr[0]; // 0 �̸��� 0���� �Ӹ� �ƴ϶� �� ��ü�� �����´�. �迭�� ù��° ���.
		for (int i=0; i<arr.length ;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	/* ��� for
	for (int num:arr) {
		if(num>max) {
			max=num;
		}
	}*/

	public static void main(String[] args) {
		int[] numbers= { 7,2,9,1,5};
		int maxnum=findMax(numbers);
		System.out.println("�ִ밪 : "+maxnum);
		
		
		
		
		
	}

}
