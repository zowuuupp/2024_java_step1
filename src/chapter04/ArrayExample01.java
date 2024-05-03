package chapter04;

public class ArrayExample01 {

	public static void main(String[] args) {
		
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
			int array[][]= { {95,86}, {83,92,96}, {78,83,93,87,88} };
				
				
			double avg=0;
			int total=0;
			int alltotal=0;
			int count=0;
			int allcount=0;
			
			int sum[]=new int[3];
			
			//for문을 이용 -> 각 행을 가져와서 각 행의 열을 읽어서 sum에 누적하고 (count++) 평균까지 
			
			for (int i=0; i<array.length; i++) {
				for (int j=0; j<array[i].length;j++) {
					
					sum[i]+=array[i][j];
					count=j+1;
					allcount++;
				}
				
				avg=(double)sum[i]/count;
				System.out.println("각 행의 합 : "+sum[i]);
				System.out.println("각 행의 평균 : "+avg);
				System.out.println("====================");
				alltotal+=sum[i];
			}
			System.out.println("전체 합 : "+alltotal);
			System.out.println("전체 평균 : "+(double)alltotal/allcount);
			
			
			
			
			
	}

}
