package chapter04;

public class ArrayTest04 {

	public static void main(String[] args) {
		
		double data[]=new double[5]; //5�� �߿���
		
		//3���� ���Կ���. ���� ������ 2���� 0�̴�.
		data[0]=10.0;
		data[1]=20.0;
		data[2]=30.0;
		
		double total=1.0;
		
		for (int i=0; i<data.length;i++) {
			
			total *= data[i]; // 0�� �ֱ⿡ ���ϸ� 0�̴�.
			
		}
		
		System.out.println("Total : "+total);
		
		
	}

}
