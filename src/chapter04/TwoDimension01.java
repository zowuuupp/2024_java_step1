package chapter04;

public class TwoDimension01 {

	public static void main(String[] args) {
		// 이차원 배열
		
		int arr[][] = new int [2][3];
		int n=0;
		
		for (int i=0; i<arr.length;i++) {
			
			for ( int j=0; j<arr[i].length ; j++) {
				
				n++;
				System.out.println((arr[i][j]=n)+" ");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println("==============================");
		
		int arr1[][]= {{1,2,3},{4,5,6}};
		
		for (int i=0; i<arr.length;i++) {
			
			for ( int j=0; j<arr[i].length ; j++) {
				
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
