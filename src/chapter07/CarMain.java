package chapter07;

public class CarMain {

	public static void main(String[] args) {
		
		//��ü �����ϸ鼭 �ʱ�ȭ
		Car myCar=new Car("����",3000);
		//��� �����̿��Ͽ� �ϳ��� �ʱ�ȭ
		//myCar.color="ȭ��Ʈ";
				
		//��������� ���� �����ؼ� ���
		System.out.println("color : "+myCar.color);
		System.out.println("cc : "+myCar.cc);
		System.out.println("-----------------------------------------");
				
		//�޼ҵ带 �̿��� ���
		System.out.println("color : "+myCar.getColor());
		System.out.println("cc : "+myCar.getCc());
		
		
		
		
		
		
		
		
		
	}

}
