package chapter03.fortest;

public class ForTest10 {

	public static void main(String[] args) {
		
		for(int i=2 ; i<=9 ; i++) {
			System.out.print("["+i+"단"+"]"+"\t"); // \t 는 탭을 의미
			
		}
		
			System.out.println(); // 얘는 엔터의 의미이다.
		
		for (int i=1 ; i<=9 ; i++) {
			for (int j=2 ; j<=9 ; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
		
			
	}

}
