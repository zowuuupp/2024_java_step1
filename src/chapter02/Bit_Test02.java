package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {
			
			int num=0B00000101;//5
			System.out.println(num);
			
			System.out.println(num << 2); // 2�� 2���� ���϶�� �Ŵ�. 5*4
			System.out.println(num >> 2); // 5/4=1
			System.out.println("===============");
			int a,b,c;
			a=5;
			b=2;
			c=a>>b;
			System.out.println(c); // 5/4
			c=a<<b;
			System.out.println(c); // 5*4
			
			
			
			
	}

}
