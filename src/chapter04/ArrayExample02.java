package chapter04;

public class ArrayExample02 {

	public static void main(String[] args) {
		
		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ��� ��հ� ��ü����� ���Ͻÿ�
			int[][] array = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} }; // 3�� j��
			
			/* ����� 2���� �迭
			95 86
			83 92 96
			78 83 93 87 88
			*/

			double avg=0; //�� ���� ���
			int total=0; //�� ���� ��
			int alltotal=0; //��ü�迭�� ��
			int count=0; //��ü ����� ���� ��
			
			//�� array.length => 3
			for (int i=0; i<array.length; i++) {
				
				for(int j=0; j<array[i].length; j++) { //0�� => 0��,1�� , ...
					
					total+=array[i][j]; //array[0][0] + array[0][1]
					count++; //��ü ��տ� ���� ī��Ʈ
				}
				
				alltotal+=total;
				avg=(double)total/array[i].length;
				System.out.println((i+1)+"��° ���� �� : "+total+"�Դϴ�.");
				System.out.println((i+1)+"��° ���� ��� : "+avg+"�Դϴ�.");
				total=0; // ���� ���� ����� ���� �����Ⱚ ����
			}
			
			
			avg=(double)alltotal/count;
			System.out.println("�迭 ��ü�� ��� : "+avg+"�Դϴ�.");
			
				
	}

}
