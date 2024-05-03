package chapter01;

public class TypeInnference13 {

	public static void main(String[] args) {
		// 묵시적 형변환: 작은 메모리에서 큰 메모리로 자연스럽게 형변환이 되는 것(byte->int)
		byte bNum=10;
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int i2Num=10;
		// byte b2Num=i2Num; // ERROR , 큰 메모리에서 작은 메모리로는 안 된다.
		
		System.out.println(i2Num);
		System.out.println("------------------");

		// 묵시적 형변환: 더 정밀한 수로 자연스럽게 암시적 형변환(int->float)
		
		int i3Num=10;
		float fNum=i3Num;
		
		System.out.println(i3Num);
		System.out.println(fNum);
		
		float f2Num=10.0f;
		//int i3Num=f2Num; // ERROR , 정밀한 거에서 단순간 것으로는 안 된다.
		
		
		System.out.println(f2Num);
		
		
		
		
		
		
		
		

	}

}
