package chapter05;

public class FuncExample02 {
	
	//최대값 메소드로 구현
	public static int findMax(int[] arr) {
		int max=arr[0]; // 0 이면은 0번방 뿐만 아니라 행 전체를 가져온다. 배열의 첫번째 요소.
		for (int i=0; i<arr.length ;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	/* 향상 for
	for (int num:arr) {
		if(num>max) {
			max=num;
		}
	}*/

	public static void main(String[] args) {
		int[] numbers= { 7,2,9,1,5};
		int maxnum=findMax(numbers);
		System.out.println("최대값 : "+maxnum);
		
		
		
		
		
	}

}
