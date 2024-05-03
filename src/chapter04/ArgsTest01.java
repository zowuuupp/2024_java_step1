package chapter04;

public class ArgsTest01 {

	public static void main(String[] args) {
		int[] numbers= new int[5]; // 선언
		numbers[0]=10; //초기화
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		for(int i=0;i<numbers.length;i++)  {	// 몇개야? 라고 해서 여기서는 5가 numbers.length로 온다.
			System.out.println(i+"인덱스에 있는 요소 : "+numbers[i]);
			
		}
		
		
	}

}
