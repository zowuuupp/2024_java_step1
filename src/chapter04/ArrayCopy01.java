package chapter04;

public class ArrayCopy01 {

	public static void main(String[] args) {
		
		int array1[] = {10,20,30,40,50};
		int array2[] = {1,2,3,4,5};
		/*�׳� Ȯ�� �׽�Ʈ
		for (int i=0; i<array1.length;i++) {
			
			System.out.println(array1[i]+" ");
		}
		
		System.out.println("=================");
		
		for(int arr2:array2) {
			
			System.out.println(arr2);
		}
		*/
		
		//������ �迭, ������ ù ��ġ, ���迭, �ٿ����� ù ��ġ, ������ ��� ����
		System.arraycopy(array1, 0, array2, 1, 3);
		for (int i=0; i<array1.length;i++) {
			
			System.out.println(array1[i]+" ");
		}
		
		System.out.println("=================");
		
		for(int arr2:array2) {
			
			System.out.println(arr2);
		}
		
	}

}
