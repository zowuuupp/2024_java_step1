package chapter04;

public class ArrayExample01 {

	public static void main(String[] args) {
		
		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ����� ���Ͻÿ�
			int array[][]= { {95,86}, {83,92,96}, {78,83,93,87,88} };
				
				
			double avg=0;
			int total=0;
			int alltotal=0;
			int count=0;
			int allcount=0;
			
			int sum[]=new int[3];
			
			//for���� �̿� -> �� ���� �����ͼ� �� ���� ���� �о sum�� �����ϰ� (count++) ��ձ��� 
			
			for (int i=0; i<array.length; i++) {
				for (int j=0; j<array[i].length;j++) {
					
					sum[i]+=array[i][j];
					count=j+1;
					allcount++;
				}
				
				avg=(double)sum[i]/count;
				System.out.println("�� ���� �� : "+sum[i]);
				System.out.println("�� ���� ��� : "+avg);
				System.out.println("====================");
				alltotal+=sum[i];
			}
			System.out.println("��ü �� : "+alltotal);
			System.out.println("��ü ��� : "+(double)alltotal/allcount);
			
			
			
			
			
	}

}
