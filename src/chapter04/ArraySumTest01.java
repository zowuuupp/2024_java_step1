package chapter04;

public class ArraySumTest01 {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		int sum=0;
		
		/*for �̿��ؼ� score���� ���  => score[0] : 98
		 sum�����濡 ���� ����
		 */
		 
		
		for (int i=0; i<score.length;i++) {
			
			System.out.println("score["+i+"] : " + score[i]);
			sum+=score[i];
		}
		
		//sum ����
		System.out.println("���� ���� �� : "+sum);
		//avg ����� ���� �� ���(��, avg�� �Ǽ�)
		double avg = (double)sum / score.length ;
		System.out.println("������ ��� : "+avg);
		//�ݿø�
		double avgR = Math.round(avg);
		System.out.println(avgR);
		double avgR3 = Math.round(avg*1000.0)/1000.0;
		System.out.println(avgR3);
	}

}
