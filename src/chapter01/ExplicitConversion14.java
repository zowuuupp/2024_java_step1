package chapter01;

public class ExplicitConversion14 {

	public static void main(String[] args) {
		
		//ĳ���� ����(����� ����ȯ)
		int iNum=1000;
		byte bNum=(byte)iNum; // -128 ~ 127 (0�� ����, 0�� �������Ѵ�)
		
		System.out.println(iNum);
		System.out.println(bNum); // ���ǵ� �����(�ս�). (byte)�� �ٿ��� ������� �����ϰ� �߾ ������ �̹� �ʰ��ߴ�. �׷��� ���� �̻��ϰ� ���´�.
		System.out.println("--------------------------");
		
		double dNum1=1.2;
		float fNum1=0.9f;
		
		int iNum2=(int)(dNum1+fNum1); // dNum1�� ���ʿ� ���� �� ����. 1.2+0.9 =>2
		int iNum3=(int)dNum1+(int)fNum1; // 1+0=1
		
		System.out.println(iNum2);
		System.out.println(iNum3);
		
		
		

	}

}
