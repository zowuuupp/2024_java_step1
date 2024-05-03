package chapter04;

public class ArrayTest04 {

	public static void main(String[] args) {
		
		double data[]=new double[5]; //5개 중에서
		
		//3개만 대입연산. 따라서 나머지 2개는 0이다.
		data[0]=10.0;
		data[1]=20.0;
		data[2]=30.0;
		
		double total=1.0;
		
		for (int i=0; i<data.length;i++) {
			
			total *= data[i]; // 0이 있기에 곱하면 0이다.
			
		}
		
		System.out.println("Total : "+total);
		
		
	}

}
